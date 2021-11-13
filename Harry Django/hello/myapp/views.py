from django.shortcuts import render
from django.http import HttpResponse
from .models import  Contact
from datetime import datetime
from django.contrib import messages

# Create your views here.

def index(request):
    value = {'val':45}
    return render(request,'index.html',value)
    # return HttpResponse("<h1>Hello</h1>")

def about(request): 
    return render(request, 'about.html')
    # return HttpResponse("This is About page")

def services(request):
    return render(request, 'services.html')
    # return HttpResponse("This is Service page")

def contact(request):

    if request.method == 'POST':
        name = request.POST.get('name')
        email = request.POST.get('email')
        ph_number = request.POST.get('phone')
        desc = request.POST.get('area')
        contact = Contact(name = name, email = email, phone = ph_number, desc = desc, date = datetime.today()) 
        contact.save()
        # message after saving the contact form
        messages.success(request, 'Profile details updated.')

    return render(request, 'contact.html')