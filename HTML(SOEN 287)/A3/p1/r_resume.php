<!DOCTYPE html>
<html lang="en">
<?php
session_start();
if( $_SESSION["forin"]=="jin"){
    echo "Status: Login";
  }else{
    header("Location: http://localhost/p1/admin.php");
}
?>
<?php
// Example 1
$kdwa="";
 $pieces = explode("\n", $_GET["textd3"]);
 $k=0;
  for($k=0;$k<count($pieces);$k++){
   $kdwa =$kdwa.'<dt>Number# '.($k+1).'</dt><dd>'.$pieces[$k].'</dd>';
  }
  $_GET["textd3"]='<dl>'.$kdwa.'</dl>';

 $pieces = explode("\n", $_GET["textd4"]);
 $k=0;
 $kdwa="";
  for($k=0;$k<count($pieces);$k++){
   $kdwa =$kdwa.'<dt>Number# '.($k+1).'</dt><dd>'.$pieces[$k].'</dd>';
  }
  $_GET["textd4"]='<dl>'.$kdwa.'</dl>';

 $pieces = explode("\n", $_GET["textd5"]);
 $k=0;
 $kdwa="";
  for($k=0;$k<count($pieces);$k++){
   $kdwa =$kdwa.'<li>'.$pieces[$k].'</li>';
  }
  $_GET["textd5"]='<ol>'.$kdwa.'</ol>';


 $pieces = explode("\n", $_GET["textd6"]);
 $k=0;
 $kdwa="";
  for($k=0;$k<count($pieces);$k++){
   $kdwa =$kdwa.'<li>'.$pieces[$k].'</li>';
  }
  $_GET["textd6"]='<ol>'.$kdwa.'</ol>';

 $pieces = explode("\n", $_GET["textd7"]);
 $k=0;
 $kdwa="";
  for($k=0;$k<count($pieces);$k++){
   $kdwa =$kdwa.'<li>'.$pieces[$k].'</li>';
  }

  $_GET["textd7"]='<ol>'.$kdwa.'</ol>';
 
?>
<head>
    <meta charset="UTF-8">
    <title>Assignemnt 2</title>
    <link rel="stylesheet" href="css.css">
</head>

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
                 <h1>Educational Qualifications</h1>
                 <div style="text-align: left;"> 
                 <?php echo $_GET["textd3"];?> </div>
                 <h1>Skill Set</h1> 
                 <div style="text-align: left;">
                 <?php echo $_GET["textd4"];?> </div>
                  <h1>Awards/Recognition</h1> 
                  <div style="text-align: left;">
                  <?php echo $_GET["textd5"];?> </div>
                  <h1>Work Experience</h1> 
                  <div style="text-align: left;">
                  <?php echo $_GET["textd6"];?>  </div>
                  <h1>Referees</h1>  
                  <div style="text-align: left;">
                  <?php echo $_GET["textd7"];?>   </div>
            </th>
    </table>
</body>

 
