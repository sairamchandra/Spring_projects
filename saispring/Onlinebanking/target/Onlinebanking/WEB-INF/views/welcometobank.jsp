<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <!-- CSS only -->
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
        <style>
            body{
                background-image: url("/Onlinebanking/myStyleFol/images/images/banking.jpg");
                background-repeat: no-repeat;
                background-size: cover;
                background-attachment: fixed;
            }
           
            strong{
                padding: 5px;
                font-size: 25px;
                
            }
            
           #well{
               margin-left: 7%;
           }
           .nav-item:hover{
               background-color: rgb(247, 34, 34);
               border-radius: 12px;
           }
        </style>
</head>
<body><br>
    <header>
        <nav class="navbar navbar-expand-lg navbar-light bg-light container">
            <a class="navbar-brand" id="str" href="login"><strong>Virtusa Bank</strong></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown"
                aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="false">
                           Accounts
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="login">Saving Account</a>
                            <a class="dropdown-item" href="login">bussines Accounnt</a>
                            <a class="dropdown-item" href="login">student Account</a>
                        </div>
                    </li>
                    <li  class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="false">
                            Loans
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="login">Home Loan</a>
                            <a class="dropdown-item" href="login">Bussiness Loan</a>
                            <a class="dropdown-item" href="login">Study Loan</a>
                            <a class="dropdown-item" href="login">Vehicle Loan</a>
                            <a class="dropdown-item" href="login">Other Loan</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="false">
                            Deposits
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="login">Fixed Deposit</a>
                            <a class="dropdown-item" href="login">Recuring Deposit</a>
                            <a class="dropdown-item" href="login">others</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                           Card Service
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="login">Credit Card Service</a>
                            <a class="dropdown-item" href="login">Debit Card Service</a>
                            <a class="dropdown-item" href="login">Create/register Card Service</a>
                        </div>
                    </li>
                    
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="false">
                            Account Info
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="login">Login Account</a>
                            <a class="dropdown-item" href="registerhere">Signup/Create account</a>
                            <a class="dropdown-item" href="admlogin">AdmLogin</a>
                        </div>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
<br><br>
<!----heading-->

<div class="card container bg-dark text-white">
    <img src="/Onlinebanking/myStyleFol/images/images/index.gif" width="cover" height="600vh" class="card-img" alt="...">
    <div class="card-img-overlay">
        <h5 class="card-title"> <strong>Virtusa bank</strong></h5>
        
    </div>
</div>
<br>


<div id="well" class="row container">

    <div class="col-sm-4">
        <div class="card">
            <div class="card-body">
                <img src="/Onlinebanking/myStyleFol/images/images/createaccount.jpg" width="cover" height="200px" alt="...">
                <h5 class="card-title">Accounnts</h5>
                <p class="card-text">With supporting text below as furter process</p>
                <a href="login" class="btn btn-primary">click here</a>
            </div>
        </div>
    </div>
    <div class="col-sm-4">
        <div class="card">
            <div class="card-body">
            <img src="/Onlinebanking/myStyleFol/images/images/loan.jpg" width="cover" height="200px" alt="...">
                <h5 class="card-title">All types of Loans</h5>
                <p class="card-text"> home,bussines etc.. Loans</p>
                <a href="login" class="btn btn-primary">click here</a>
            </div>
        </div>
    </div>
    <div class="col-sm-4">
        <div class="card">
            <div class="card-body">
                <img src="/Onlinebanking/myStyleFol/images/images/user.jpg" width="cover" height="200px" alt="...">
                <h5 class="card-title"> Card Services</h5>
                <p class="card-text">  card all types of services </p>
                <a href="login" class="btn btn-primary">click here</a>
            </div>
        </div>
    </div>
</div><br>
<div id="well" class="row container">

    <div class="col-sm-4">
        <div class="card">
            <div class="card-body">
            <img src="/Onlinebanking/myStyleFol/images/images/cashwithdrew.jpg" width="cover" height="200px" alt="...">
                <h5 class="card-title">Banking Service</h5>
                <p class="card-text"> by using this u can transfer and deposit money </p>
                <a href="login" class="btn btn-primary">click here</a>
            </div>
        </div>
    </div>
    
</div>
<br>
<!-------main32-->
<div class="card container mb-3">
    <img src="/Onlinebanking/myStyleFol/images/images/footer2.jpg" width="cover" height="150vh" class="card-img-top" alt="...">
    <div class="card-body">
        <h5 class="card-title">one of the top 5 list our bank also</h5>
        <p class="card-text">we hope You trust us.</p>
        <a href="devlopers">App Developed by</a>
    </div>
</div>


</body>
</html>