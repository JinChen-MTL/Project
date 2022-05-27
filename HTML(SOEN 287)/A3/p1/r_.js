function submitResume() {
    // Get the data from each element on the form.
   // const msg1 = document.getElementById('msg1');
    //const msg2 = document.getElementById('msg2');
    const msg3 = document.getElementById('msg3');
    const msg4 = document.getElementById('msg4');
    const msg5 = document.getElementById('msg5');
    const msg6 = document.getElementById('msg6');
 
    // This variable stores all the data.
    let data =
        'name : ' + '\r' + msg3.value + '\r' +
        'email : ' + '\r' + msg4.value + '\r' +
        'phone_number : ' + '\r' + msg5.value + '\r' +
        'Message box : ' + '\r' + msg6.value  ;

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


function processLogout() {
    Window.sessionStorage.clear();
}
