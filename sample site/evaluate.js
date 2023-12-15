class food_item
{
    constructor(price){
        this.count=0;
        this.itemPrice=price;
    }
    increment(){
        ++this.count;
    }
    decrement(){
        if(this.count>0)
        --this.count;
    }
    total(){
        return this.count*this.itemPrice;
    }
}

idli=new food_item(5);
dosa=new food_item(30);
pongal=new food_item(45);
poori=new food_item(40);
meals=new food_item(70);
briyani=new food_item(100);
porota=new food_item(12);
chappathi=new food_item(20);


function increment(element){
    if(element.name=="idli"){
        idli.increment();
        document.getElementById("idli").value=idli.count;
    }
    else if(element.name=="dosa"){
        dosa.increment();
        document.getElementById("dosa").value=dosa.count;
    }
    else if(element.name=="poori"){
        poori.increment();
        document.getElementById("poori").value=poori.count;
    }
    else if(element.name=="pongal"){
        pongal.increment();
        document.getElementById("pongal").value=pongal.count;
    }
    else if(element.name=="meals"){
        meals.increment();
        document.getElementById("meals").value=meals.count;
    }
    else if(element.name=="briyani"){
        briyani.increment();
        document.getElementById("briyani").value=briyani.count;
    }
    else if(element.name=="porota"){
        porota.increment();
        document.getElementById("porota").value=porota.count;
    }
    else if(element.name=="chappathi"){
        chappathi.increment();
        document.getElementById("chappathi").value=chappathi.count;
    }
}
function decrement(element){
    if(element.name=="idli"){
        idli.decrement();
        document.getElementById("idli").value=idli.count;
    }
    else if(element.name=="dosa"){
        dosa.decrement();
        document.getElementById("dosa").value=dosa.count;
    }
    else if(element.name=="poori"){
        poori.decrement();
        document.getElementById("poori").value=poori.count;
    }
    else if(element.name=="pongal"){
        pongal.decrement();
        document.getElementById("pongal").value=pongal.count;
    }
    else if(element.name=="meals"){
        meals.decrement();
        document.getElementById("meals").value=meals.count;
    }
    else if(element.name=="briyani"){
        briyani.decrement();
        document.getElementById("briyani").value=briyani.count;
    }
    else if(element.name=="porota"){
        porota.decrement();
        document.getElementById("porota").value=porota.count;
    }
    else if(element.name=="chappathi"){
        chappathi.decrement();
        document.getElementById("chappathi").value=chappathi.count;
    }
}
function totalbill(){
    let rupees=(idli.total()+dosa.total()+poori.total()+pongal.total()+meals.total()+briyani.total()+porota.total()+chappathi.total());
    if(rupees>0){
        var food="";
        if(idli.count>0)
        food+="Idli: "+idli.count+"\n";

        if(dosa.count>0)
        food+="Dosa: "+dosa.count+"\n";

        if(poori.count>0)
        food+="Poori: "+poori.count+"\n";

        if(pongal.count>0)
        food+="Pongal: "+pongal.count+"\n";

        if(meals.count>0)
        food+="Meals: "+meals.count+"\n";

        if(briyani.count>0)
        food+="Briyani: "+briyani.count+"\n";

        if(porota.count>0)
        food+="Poroto: "+porota.count+"\n";

        if(chappathi.count>0)
        food+="Chappathi: "+chappathi.count+"\n";

        alert(food+"Rupees: "+rupees+"\nThank you visit again... :)");
    }
}