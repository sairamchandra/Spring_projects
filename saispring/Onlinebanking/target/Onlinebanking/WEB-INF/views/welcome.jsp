<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
    crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
    integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
    crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
    crossorigin="anonymous"></script>
<script src="https://unpkg.com/@popperjs/core@2"></script>
</head>
<body>
    <style>
        header{
            height: 7.5vh;
            background-color: rgba(6, 50, 245, 0.911);
            width: 100%;
        }
        main{
            background-image: url("/Onlinebanking/myStyleFol/images/images/detailswel.jpg");
            background-repeat: no-repeat;
            background-size: cover;
            height: 85vh;
            width: 100%;
        }
        footer{
            height: 10vh;
            width: 100%;
            background-color: rgba(247, 246, 250, 0.788);
        }
        h2{
        font-size: 25px;
        color: white;
        text-align: center;
        
        }
        #foot{
            line-break: 70px;
            text-align: center;
            font-size: medium;
            font-weight: 500;

        }
    </style>
    <header>
   <h1><strong>Virtusa Bank</strong></h1> &nbsp;<button><a href="logout"> logout</a></button>
      </header>
    <!---main page-->
    <main>


<br>
<h2>id is : ${id}</h2>
<h2>username is : ${username}</h2>
<h2>fullname is : ${fullname}</h2>
<h2>client number is : ${phone}</h2>
<h2>account number is : ${accountnumber}</h2>
<h2>client amount is : ${amount}</h2>
<h2>client email is : ${email} </h2>
<h2>client city is : ${city}</h2>
<h2>client state is : ${state}</h2>
<br>
<h2>if you add money click here : <a href="addat">add amount</a></h2>
    </main>
    <!-----footer-->
    <footer>
        <h3 id="foot">
            © 2021 Virtusa Bank . All rights reserved
        </h3>
    </footer>

</body>
</html>