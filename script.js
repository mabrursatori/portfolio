$(document).ready(function(){
    $(window).scroll(function(){
        if(this.scrollY > 20){
            console.log(this.scrollY)
            $('.navbar').addClass("sticky");
        }else{
            $('.navbar').removeClass("sticky");
        }
    });
});