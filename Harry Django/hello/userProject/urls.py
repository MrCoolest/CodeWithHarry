from django.contrib import admin
from django.urls import path
from userProject import views
urlpatterns = [
    path('admin/', admin.site.urls),
    path('',views.user,name='user'),
    path('login',views.loginUser,name='loginUser'),
    path('logout',views.logoutUser,name='logoutUser')
]