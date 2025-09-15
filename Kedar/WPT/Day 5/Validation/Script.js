function addData(){
    let fname = document.getElementById("fname").value;
    let LName = document.getElementById("lname").value;
    let email = document.getElementById("email").value;
    let dob = document.getElementById("dob").value;

    let table = document.getElementById("table1")
    let newrow = table.insertRow(table.rows.length);

    newrow.insertCell(0).innerHTML = fname;
    newrow.insertCell(1).innerHTML = LName;
    newrow.insertCell(2).innerHTML = email;
    newrow.insertCell(3).innerHTML = dob;
    newrow.insertCell(4).innerHTML =
                '<button onclick="editData(this)">Edit</button>' +
                '<button onclick="deleteData(this)">Delete</button>';
    clearInputs();

            }
    function editData(button){

        let row = button.parentNode.parentNode;

        let fnamecell = row.cells[0];
        let lnamecell = row.cells[1];
        let emailcell = row.cells[2];
        let dobcell = row.cells[3];

        let firstname =
                prompt("Enter the updated name:",
                    fnamecell.innerHTML);
        let lastName = 
        prompt("Enter the Last Name : ",
                lnamecell.innerHTML
        );
        let emailid = 
        prompt("Enter the Email Id : ",
            emailcell.innerHTML);
        let dateob = prompt("Enter the DOB ",
            dobcell.innerHTML
        );

          // Update the cell contents with the new values
            fnamecell.innerHTML = firstname;
            lnamecell.innerHTML = lastName;
            emailcell.innerHTML = emailid;
            dobcell.innerHTML = dateob;

            
         

        
    }

function deleteData(button){
    let row = button.parentNode.parentNode;

    row.parentNode.removeChild(row);
}