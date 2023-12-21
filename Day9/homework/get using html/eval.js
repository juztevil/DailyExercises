$(document).ready(function(){
    $(document).ready(function(){
        $('#btn').click(function(){
            $.get('https://reqres.in/api/users/'+document.getElementById('txt_box').value,function(apidata,status){
                let keys=Object.keys(apidata.data);
                for(let i=0;i<keys.length;++i){
                    let p=document.createElement('p');
                    p.innerText=keys[i]+"  :  "+apidata.data[keys[i]];
                    document.querySelector('body').appendChild(p);
                }
            })
        });
    });
});