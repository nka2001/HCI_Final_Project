

function closeForm() {
	window.location.href = "../index.html";
}

var stud1 = new Object();
	stud1.fName = "Nick";
	stud1.LName = "Andrle";
	stud1.DOB = "2-15-2001";
	stud1.userID = "nxa1znn";
	stud1.password = "admin";

function checkAndPass(){
	
	
	
	if(document.getElementById('UID').value == "nxa1znn" && document.getElementById('UPW').value == "admin"){
		window.location.href = "/html/dashboard.html"
	}
	else {
		alert("Error, Invalid login");
	}
	
	
}

