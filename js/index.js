const product1 = {
    /*name: "Resident Evil 4(2023)",
   info: "Reimagined for 2023 to bring state-of-the-art survival horror. Resident Evil 4 preserves the essence of the original game, while introducing modernized gameplay, a reimagined storyline, and vividly detailed graphics to make this the latest survival horror game where life and death, terror and catharsis intersect.",
   color: "white,red,brown,orange",
   price: "$59.99",*/
    source: "/assets/guy.jpg"
}

const product2 = {
    /*name: "Resident Evil 4(2023)",
   info: "Reimagined for 2023 to bring state-of-the-art survival horror. Resident Evil 4 preserves the essence of the original game, while introducing modernized gameplay, a reimagined storyline, and vividly detailed graphics to make this the latest survival horror game where life and death, terror and catharsis intersect.",
   color: "white,red,brown,orange",
   price: "$59.99",*/
    source: "/assets/sam.jpg"
}
const product3 =
{
    /*name: "Resident Evil 4(2023)",
    info: "Reimagined for 2023 to bring state-of-the-art survival horror. Resident Evil 4 preserves the essence of the original game, while introducing modernized gameplay, a reimagined storyline, and vividly detailed graphics to make this the latest survival horror game where life and death, terror and catharsis intersect.",
    color: "white,red,brown,orange",
    price: "$59.99",*/
    source: "/assets/monsoon.jpg"
}

var products = [
    product1,
    product2,
    product3
]
var leftButton = document.getElementById("leftarrow-Button")

var rightButton = document.getElementById("rightarrow-Button")


var prodIndex=0;

function setProduct(index) {
   // document.getElementById("Pname").innerText = products[index].name;
    //document.getElementById("PDesc").innerText = products[index].info;
   // document.getElementById("Pprice").innerText = products[index].price;
   // document.getElementById("Pcolor").innerText = products[index].color;
    //document.getElementById("prodImg").style.visibility = 'visible';
    document.getElementById("homeImage").src = products[index].source;
    //alert(`The Product you Selected is ${ProductName.innerText}`)

}

rightButton.onclick = function () {

    prodIndex ++;

    if (prodIndex > 3){
        prodIndex=0;
    }
    setProduct(prodIndex);

    


   
    
}

leftButton.onclick = function () {

    prodIndex--;
    if(prodIndex < 0){
        prodIndex=2;
        setProduct(prodIndex);
        //setProduct(prodIndex);
    }
    setProduct(prodIndex);






}

var loginButton = document.getElementById("Login");
loginButton.onclick = function () {
    window.location.href = "/html/login.html";
    confirm("You are now going to the login view");
};