var backButton = document.getElementById("BackClick");
backButton.onclick = function () {
    window.location.href = "/html/dashboard.html";
    confirm("You are now going back to the dashboard view");
};

var tutorForm = document.getElementById("tutorForm");
tutorForm.addEventListener("submit", function (event) {
    event.preventDefault();
    alert("Your Form has been Submitted");
});


