from django.db import reset_queries
from django.shortcuts import render,redirect
from django.contrib.auth import authenticate,login,logout
from django.contrib.auth.models import User
# adding user from admin panel password is ankit213@#$
# Create your views here.

def index(request):
    if request.user.is_anonymous:
        return redirect('/login')
    return render(request, 'index2.html')

def loginUser(request):
    if request.method == 'POST':
        usernmae = request.POST.get('username')
        password = request.POST.get('password')
        print(usernmae, password)
        user = authenticate(username=usernmae, password=password)
        if user is not None:
            # A backend authenticated the credentials
            login(request,user)
            return redirect('/')
    return render(request, 'login.html')

def logoutUser(request):
    logout(request)
    return redirect('/login')