from os import curdir
from sys import _current_frames


try:
     import pyttsx3
     import speech_recognition as sr
     import wikipedia
     import datetime
     import webbrowser
     import os
     import random
     import datetime
except Exception as e:
     print(f"Error in import of modules :{e}") 


crome_path = "C:\Program Files\Google\Chrome\Application\chrome.exe %s"

engine = pyttsx3.init('sapi5')

voices = engine.getProperty('voices')
engine.setProperty('voice', voices[0])

def speak(audio):
     ''' This is a function which help to Speek the things '''
     engine.say(audio)
     engine.runAndWait()


def wishme():
     '''
     This is a Function which wish me on start
     '''
     hour = int(datetime.datetime.now().hour)
     if hour >=0 and hour < 12:
          speak("Good Moring !")

     elif hour>=12 and hour<17:
          speak("Good Afternoon Sir !")

     else:
          speak("Good evening")

     speak("\nI'm Jarvis \n How Can i HElp you")


def takeCommand():
     '''It takes microphone voice as input recognise it..'''
     r = sr.Recognizer()
     with sr.Microphone() as source:
          print("listing")
          r.pause_threshold = 1
          audio = r.listen(source)
     try: 
          print("Recoginiting...")
          query = r.recognize_google(audio, language = 'en-in') 
          print(f"User said {query}")

     except Exception as e:
          print(e)     
          print("Say that again please ...")
          return "Nono"
     return query     



if __name__ == "__main__":
     # speak("Hello Sir I'm Jarvis \n How Can i HElp you")
     wishme()
     while True:
          query = takeCommand().lower()

          if 'wikipedia' in query:
               speak('Searching Wikipedia...')
               query = query.replace('Wikipedia', "")
               results = wikipedia.summary(query, sentences = 2)
               speak("According to wikipedia")
               print(results)
               speak(results)

          elif 'open youtube' in query:
               webbrowser.open("www.youtube.com")

          elif 'open google' in query:
               webbrowser.open("www.google.co.in")

          elif 'open github' in query:
               webbrowser.open("www.github.com")

          elif 'open stack overflow' in query:
               webbrowser.open("www.stackoverflow.com")

          elif 'open whatsapp' in query:
               webbrowser.open("https://web.whatsapp.com/")

          elif 'play music' in query:
               music_dir = "C:\\Users\\Ankit Patwa\\Music"
               songs = os.listdir(music_dir)
               print(songs)
               os.startfile(os.path.join(music_dir,songs[random.randrange(0, len(songs))]))

          elif ('time' or'current time') in query:
               current_time = datetime.datetime.now().strftime("%H:%M:%S")
               print(current_time)
               speak(current_time)

          elif ('open code' or 'open vs code') in query:
               vs_code_path = r"C:\Users\Ankit Patwa\AppData\Local\Programs\Microsoft VS Code\Code.exe"
               os.startfile(vs_code_path)

          elif "jarvis quit" in query:
               exit()

