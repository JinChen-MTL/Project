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
 
$kdwa="";
$kdwa='<area shape="rect" coords="0,0,100,100" alt="facebook" href='.$_GET["textd10"].'>';
$_GET["textd10"]=$kdwa;

$kdwa="";
$kdwa='<area shape="rect" coords="0,100,100,200" alt="instegram" href='.$_GET["textd11"].'>';
$_GET["textd11"]=$kdwa;

$kdwa="";
$kdwa='<area shape="rect" coords="0,200,100,300" alt="whatsapp" href='.$_GET["textd12"].'>';
$_GET["textd12"]=$kdwa;
 
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
                </div><br>
                <div id="cent">
                    <img src="social.jpg" alt="apps" usemap="#apps" width="300" height="300">
                    <map name="apps">
                    <?php echo $_GET["textd10"] ;?>
                    <?php echo $_GET["textd11"] ;?>
                    <?php echo $_GET["textd12"] ;?>
                    </map>
                </div>

            </th>
        </tr>
    </table>




</body>


</html>