from django.shortcuts import render, HttpResponse

# Create your views here.
def user(request):
    return render(request,'index2.html')

def loginUser(request):
    # if request.method == 'POST':
    #     email=request.POST.get('email')
    #     password=request.POST.get('password')
    #     print(email,password)
    return render(request,'login.html')

def logoutUser(request):
    return render(request,'index2.html')
