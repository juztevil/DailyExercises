$(document).ready(function(){
    $('#btn').click(function(){
        $.get('https://api.thecatapi.com/v1/images/search',function(apidata,status){
            let img=document.createElement('img');
            img.setAttribute('src',apidata[0]['url']);
            img.setAttribute('width','200px');
            img.setAttribute('height','200px');
            document.querySelector('body').appendChild(img);
        })
    })
});
