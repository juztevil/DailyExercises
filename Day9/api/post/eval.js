$(document).ready(function(){
    $('#btn').click(function(){
        let obj={name : document.getElementById('name').value+"",job:document.getElementById('role').value+""};
        $.post('https://reqres.in/api/users',obj,function(apidata,status){
            let keys=Object.keys(apidata);
            for(let i=0;i<keys.length;++i){
                let p=document.createElement('p');
                p.innerText=keys[i]+"  :  "+apidata[keys[i]];
                document.querySelector('body').appendChild(p);
            }
        });
    });
});