function validateForm() {
  var x = document.getElementById("name").value;
  if (x == "") {
    alert("Name must be filled out");
    return false;
  }
  var x = document.getElementById("email").value;
  if (x == "") {
    alert("Email must be filled out");
    return false;
  }
  var x = document.getElementById("phone").value;
  if (x == "") {
    alert("Phone must be filled out");
    return false;
  }
}
