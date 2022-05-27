<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Assignemnt 2</title>
    <link rel="stylesheet" href="css.css">
    <script src="js.js"></script>
</head>
<?php
session_start();
if( $_SESSION["forin"]=="jin"){
    echo "Status: Login";
  }else{
    header("Location: http://localhost/p1/admin.php");
}
?>
<?php
 
 $pieces = explode("\n", $_GET["textd9"]);
 $k=0;
 $kdwa="";
  for($k=0;$k<count($pieces);$k++){
   $kdwa =$kdwa.'<li>'.$pieces[$k].'</li>';
  }
  $_GET["textd9"]='<ol>'.$kdwa.'</ol>';
 
?>

<body>
    <table id="t1">
        <tr>
            <th>
            div id="bar">
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
                <label for="msg8">PROJECTS</label>
                <div style="text-align: left;">
                 <?php echo $_GET["textd9"];?>
</div>
                </th>
    </table>
</body>

 
