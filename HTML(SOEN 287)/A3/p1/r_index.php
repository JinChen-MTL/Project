<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Assignemnt 2</title>
    <link rel="stylesheet" href="css.css">
</head>
<?php
session_start();
if( $_SESSION["forin"]=="jin"){
    echo "Status: Login";
  }else{
    header("Location: http://localhost/p1/admin.php");
}
?>
<body>
    <table id="t1">
        <tr>
            <th>
            <div id="bar">
                    <a href="r_index.php">
                        Home
                    </a>
                    <a href="r_resume.php">
                        Resume
                    </a>
                    <a href="r_project.php">
                        Projects
                    </a>
                    <a href="contact.html">
                        Contact
                    </a>
                    <a href="r_social.php">
                        Social
                    </a>
                    <a href="fulllogout.php">
                        logout
                    </a>
                </div>
                <br>
                <div id="cent">
                    <img src="imageofmine.jpg" alt="image" id="image">
                <div>
                <label for="msg5">Professional Statement</label><br>
                <div class="a"> <?php echo $_GET["textd2"];?> </div> 
                 <label for="msg6">Brief Biography</label><br>
                 <div class="a"> <?php echo $_GET["textd3"];?> </div>
                </div>    
             </th>
    </table>
</body>

 
