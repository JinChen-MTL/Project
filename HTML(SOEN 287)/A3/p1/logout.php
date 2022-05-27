<?php
session_start();
unset($_SESSION["forin"]);
if(!isset($_SESSION["forin"])){
    header("Location: http://localhost/p1/admin.php");
}
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Assignemnt 2</title>
    <link rel="stylesheet" href="css.css">
    <script src="js.js"></script>
</head>
<script>
    function clear_me() {
    localStorage.clear();
    checkStorage();
}
</script>
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
                    <a href="contact.php">
                        Contact
                    </a>
                    <a href="r_social.php">
                        Social
                    </a>
                    <a href="fullogout.php">
                        logout
                    </a>
                </div>
                <br>
                <button onclick="clear_me()">logout</buttton>
 
                </th>
    </table>
</body>

 