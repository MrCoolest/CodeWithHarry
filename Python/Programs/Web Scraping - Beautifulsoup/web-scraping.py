# if wo wnat to scrap a website :
# 1) Use the Api
# 2) Html Scraping using some tool like Bs4

# libararys required
# pip install requests
# pip install bs4
# pip install html5lib



import requests
from bs4 import BeautifulSoup
url = 'https://codewithharry.com'

# step 1: Get the HTMl
r = requests.get(url)
htmlContent = r.content
# print(htmlContent)
# step 2: Parse the HTMl

soup = BeautifulSoup(htmlContent, 'html.parser')
# print(soup.prettify)

# step 3 : Html Tree Traversal
# get the title of the Html Page
title = soup.title
# commonly used type of object:
# print(title)  # 1. Tag
# print(type(title.string)) # 3.navigatable string
# print(type(soup)) # 4.beautifulsoup


# # 5.comment
# markup = '<p><!-- this is a comment --></p>'
# soup2 = BeautifulSoup(markup)
# print(soup2.p.string)
# print(type(soup2.p.string))



# get all the Paragraphs form the page
# paras = soup.find_all('p')
# print(paras)


# get all Anchor tags
# anchors = soup.find_all('a')
# print(anchors)

# all_links  = set()

# get all the links of A tag
# for link in anchors:
#      if(link.get('href') != '#'):
#           all_links.add("http://codewithharry.com/" +link.get('href'))

# print(all_links)



# get first elements
# print(soup.find('p'))
 

#  get class of any elemets of Html
# print(soup.find('p')['class'])

# find all the elements with class leads
# print(soup.find_all('p',class_="lead"))


# get the text form the elements / tags or soup

# print(soup.find('p').get_text())
# print(soup.get_text())



navbar = soup.find(id = 'navbarSupportedContent')
# print(navbar)
# print(navbar.contents)

# .contents - A tags children are avialable as list
# .childrens - A tags children are avialable as generator

# for elem in navbar.contents:
# for elem in navbar.children:
# for elem in navbar.strings:
# for elem in navbar.stripped_strings:
#      print(f'{elem}')

# print(navbar.parent)

# print(navbar.parents) #returns a genrator

# for item in navbar.parents:
#      # print(item)
#      print(item.name)


# print(navbar.next_sibling.next_sibling)
# print(navbar.previous_sibling.previous_sibling)


# elem = soup.select('#loginModal')
elem = soup.select('.modal-footer')
print(elem)