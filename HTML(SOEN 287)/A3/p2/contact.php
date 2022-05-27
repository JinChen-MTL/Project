<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Assignemnt 2</title>
    <link rel="stylesheet" href="css.css">
    <script src="js.js"></script>
</head>


<body>
    <table id="t1">
        <tr>
            <th>
                <div id="bar">
                <a href="index.php">
                        Home
                    </a>
                    <a href="resume.php">
                        Resume
                    </a>
                    <a href="projects.php">
                        Projects
                    </a>
                    <a href="contact.php">
                        Contact
                    </a>
                    <a href="social.php">
                        Social
                    </a>
                    <a href="logout.php">
                        logout
                    </a>
                </div>
                <br>
                <div>
                    
                 <?php
                if(isset($_POST['upload'])){
                    $fileContent = file_get_contents($_FILES['file']['tmp_name']);
                    echo  '<textarea  rows="20" cols="50">'.$fileContent.'</textarea>';
                }
                ?>
                <form action="?" method="post" enctype="multipart/form-data">
                    <label >upload file:</label> 
                    <input type="file" name="file" />
                    <input type="submit" name ="upload"value="Submit">
                </form>
            </div>
            </th>
        </tr>
    </table>

</body>
                 