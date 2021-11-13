from django.contrib import admin
from django.urls import path
from . import views

urlpatterns = [
    path('',views.index,name='Home'),
    path('about',views.about,name='about'),
    path('services',views.services,name='services'),
    path('contact',views.contact,name='contact'),
    
]

admin.site.site_header = "ICE VILLA Admin"
admin.site.site_title = "ICE VILLA Admin Portal"
admin.site.index_title = "Welcome to ICE VILLA"