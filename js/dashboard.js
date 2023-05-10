var logoutButton = document.getElementById("Logout")



logoutButton.onclick = function () {

    window.location.href = "/html/login.html";
  
    
    alert("you have been logged out going page to login");
 






}
const tutorImg = document.querySelector('#clickable-tutor')

tutorImg.addEventListener('click', 
e => {
     window.location.href = "/html/tutorform.html"; 

}) 

const textbookImg = document.querySelector('#clickable-textbook')

textbookImg.addEventListener('click',
    e => {
        window.location.href = "/html/textbook.html";

    }) 