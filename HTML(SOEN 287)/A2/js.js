//homepage
function submitIndex() {
    // Get the data from each element on the form.
    const msg1 = document.getElementById('msg1');
    const msg2 = document.getElementById('msg2');
    // This variable stores all the data.
    let data =
        'Professional Statement : ' + '\r'+ msg1.value + '\r' +
        'Brief Biography: '+ '\r' + msg2.value;
    const fName = 'index.txt';
    // Convert the text to BLOB.
    var data2Blob = new File([data], fName, {
        type: "text/plain"
    });
    let link = document.createElement("a");
    link.download = fName;
    link.href = window.URL.createObjectURL(data2Blob);
    document.body.appendChild(link);
    link.click();

}
//resume
function submitResume() {
    // Get the data from each element on the form.
   // const msg1 = document.getElementById('msg1');
    //const msg2 = document.getElementById('msg2');
    const msg3 = document.getElementById('msg3');
    const msg4 = document.getElementById('msg4');
    const msg5 = document.getElementById('msg5');
    const msg6 = document.getElementById('msg6');
    const msg7 = document.getElementById('msg7');

    // This variable stores all the data.
    let data =
        'Educational Qualifications : ' + '\r' + msg3.value + '\r' +
        'Skill Set : ' + '\r' + msg4.value + '\r' +
        'Awards/Recognition : ' + '\r' + msg5.value + '\r' +
        'Work Experience : ' + '\r' + msg6.value + '\r' +
        'Referees : ' + '\r' + msg7.value;

    const fName = 'Resume.txt';
    // Convert the text to BLOB.
    var data2Blob = new File([data], fName, {
        type: "text/plain"
    });
    let link = document.createElement("a");
    link.download = fName;
    link.href = window.URL.createObjectURL(data2Blob);
    document.body.appendChild(link);
    link.click();
}
//projects
function submitProjects() {
    // Get the data from each element on the form.

    const msg8 = document.getElementById('msg8');

    // This variable stores all the data.
    let data =
        'My Projects : ' + '\r' + msg8.value;

    const fName = 'Project.txt';
    // Convert the text to BLOB.
    var data2Blob = new File([data], fName, {
        type: "text/plain"
    });
    let link = document.createElement("a");
    link.download = fName;
    link.href = window.URL.createObjectURL(data2Blob);
    document.body.appendChild(link);
    link.click();
}
//contact
function ReadMessages() {
    var uploadFile = document.getElementById("uploadFile").files[0];
    var fileReader = new FileReader();
    fileReader.onload = function () {
        document.getElementById("displaymessage").innerHTML = "";
        var arr = fileReader.result.trim().split(/\r\n|\r|\n/);
        let table = document.createElement("table");
        for (let i = 0; i < arr.length; i++) {
            let arr2 = arr[i].split(":");
            let tr = document.createElement("tr");
            let c1 = document.createElement("td");
            let c2 = document.createElement("td");
            c1.innerHTML = arr2[0];
            c2.innerHTML = arr2[1];

           c1.style.width = "5%";
           //c2.style.border = "black solid";
            tr.appendChild(c1);
            tr.appendChild(c2);
            table.appendChild(tr);
        }
        table.style.marginLeft = "auto";
        table.style.marginRight = "auto";
        table.style.border = "black solid";
        document.getElementById("displaymessage").style.fontSize = "x-large";
        document.getElementById("displaymessage").appendChild(table);
    };
    fileReader.readAsText(uploadFile);
}
//social
function submitSocial() {
    // Get the data from each element on the form.
    const msg9 = document.getElementById('msg9');
    const msg10 = document.getElementById('msg10');
    const msg11 = document.getElementById('msg11');

    // This variable stores all the data.
    let data =
        'Social Link 1: ' + msg9.value + '\r' +
        'Social Link 2: ' + msg10.value + '\r' +
        'Social Link 3: ' + msg11.value;
    const fName = 'Social.txt';
    // Convert the text to BLOB.
    var data2Blob = new File([data], fName, {
        type: "text/plain"
    });
    let link = document.createElement("a");
    link.download = fName;
    link.href = window.URL.createObjectURL(data2Blob);
    document.body.appendChild(link);
    link.click();
}
//logout
function processLogout() {
    Window.sessionStorage.clear();
}
