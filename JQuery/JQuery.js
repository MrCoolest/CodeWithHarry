$(document).ready(function () {
    // console.log($);
    // console.log(jQuery);
    // console.log("Hello, World!);

    // $('Selector').action();

    // $('p').click(function () {
    //     console.log("You clicked on Paragraph");
    //     $(this).hide();
    // });


    // $('p').click(function () {
    //     console.log("You clicked on Paragraph");
    //     // $(this).hide();
    // });
    // $('.hide').click(function () {
    //     $('h1').hide();
    //     console.log('now heading is get hide')
    // });

    // $('.unhide').click(function () {
    //     $('h1').show();
    //     console.log('now heading is showing in Dom')
    // });


    // There are three types of selector in jQuery
    // 1. element selectors
    // 2. Id selectors
    // 3. class selector


    // id selectors
    // $('#second').click(function () {
    //     console.log("You clicked on Second paragraph", this);
    // })

    // Class selector
    // $('.odd').click(function () {
    //     console.log("You clicked on odd paragraphs ", this)
    // })
    // $('p.odd').click();
    // $('p:first').click();

    // Events in jQuery

    // Mouse Events :- click, dblclick, mouseenter, mouseleave, mousedown, mouseup, hover;
    // Keyboards Events  : - keypress , keydown , keyup.
    // Form Events :- submit, change, focus, blur.
    // document / window Events :- load ,  resize , scroll , unload  

    // dblclick event
    // $('p').dblclick(function(){
    //     console.log("you double clciked on paragraph");
    // })

    // mouseenter
    // $('p').mouseenter(function(){
    //     console.log("You enter on", this);
    // });
    // $('p').mouseleave(function(){
    //     console.log("You leave thee", this);
    // });
    // $('p').mousedown(function(){
    //     console.log("You mousedown on this", this);
    // });


    // ON method demo
    // $('p').on('click',function(){
    //     console.log('Thanks for clicking');
    // });

    // $('p').on(
    //     {
    //         click : function() {
    //             console.log('Thanks for clicking');
    //         },
    //     dblclick : function() {
    //         console.log('thanks for double click');
    //     }
    //     });

    // $('.lo').hide(5000, function(){
    //     console.log("hidden");
    // });
    // $('.lo').show(5000,function(){
    //     console.log("Show");
    // });

    // $('.animations').click(function(){
    //     $('.lo').toggle(2000);
    // });

    // fadeout()
    // fadein()
    // fadetoggle()
    // fadeto()

    // fadeOut
    // $('.animations').click(function(){
    //     $('.lo').fadeOut(2000);
    // });

    // fadein
    // $('.hide').click(function(){
    //     $('.lo').fadeIn(2000);
    // });

    // fadeToggle
    // $('.animations').click(function(){
    //     $('.lo').fadeToggle(2000);
    // });

    // fadeto
    // $('.animations').click(function(){
    //     $('.lo').fadeTo('slow',0.15);
    // });

    // slidedown
    // slideup
    // sldetoggle
    // $('.hide').click(function () {
    //     $('.lo').slideDown(1000);

    // })
    // $('.animations').click(function () {
    //     $('.lo').slideUp(1000);
    // })

    // slideToogle
    // $('.animations').click(function () {
    //         $('.lo').slideToggle(1000);
    //     })

    // Animate function in jQuery
    // $('.animations').click(function(){
    //     $('.lo').animate({opacity: 0.5}, 2000);
    // });

    // $('.animations').click(function(){
    //     $('.lo').animate({
    //         color: '#454545',
    //         height:'300px',
    //         width:'300px',
    //         opacity:0.5},
    //         2000);
    // });

    // $('.animations').click(function(){
    //         $('.lo').animate({opacity: 0.2}, 2000);
    //         $('.lo').animate({width: '150px'}, 1000);
    //         $('.lo').animate({height: '400px'}, 500);
    //         $('.lo').animate({opacity: 0.9}, 1000);
    //     });

    // $('lo').stop();

    // HtML Dom manipulation
    // $('h1').text()
    // $('h1').text("I am Anklit Patwa")

    // $('body').html();
    // $('body').html("Ankit Is Awsome guy");

    // $('#tx').val();
    // $('#tx').val('Hello Everyone');


    // $('.lo').empty();
    // $('.lo').remove();

    // $('.lo').addClass("myclass");
    // $('.lo').removeClass("lo");
    // $('.lo').toggleClass('new'); // used to add / remove class



    // css

    // $('.lo').css("background-co{lor","yellow");
    // $('.lo').css("background-color");
    // "rgb(255, 255, 0)"
    // $('.lo').css("border","2px solid red");
    // $('.lo').css("border","15px solid red");
    // $('.lo').css("border-radius","15px");}



});







