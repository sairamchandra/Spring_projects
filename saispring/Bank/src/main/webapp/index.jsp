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
            background-image: url("images/maingif");
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
        #foot{
            line-break: 70px;
            text-align: center;
            font-size: medium;
            font-weight: 500;

        }
    </style>
    <header>
        <nav class="navbar navbar-expand-lg navbar-light bg-light container">
            <a class="navbar-brand" href="#"><strong>Virtusa Bank</strong></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown"
                aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Accounts
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="CreateForm.html">Saving Account</a>
                            <a class="dropdown-item" href="CreateForm.html">bussines Accounnt</a>
                            <a class="dropdown-item" href="CreateForm.html">student Account</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Loans
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="#">Home Loan</a>
                            <a class="dropdown-item" href="#">Bussiness Loan</a>
                            <a class="dropdown-item" href="#">Study Loan</a>
                            <a class="dropdown-item" href="#">Vehicle Loan</a>
                            <a class="dropdown-item" href="#">Other Loan</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Deposits
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="#">Fixed Deposit</a>
                            <a class="dropdown-item" href="#">Recuring Deposit</a>
                            <a class="dropdown-item" href="#">others</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Card Service
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="Atm.html">Credit Card Service</a>
                            <a class="dropdown-item" href="Atm.html">Debit Card Service</a>
                            <a class="dropdown-item" href="Atm.html">Create/register Card Service</a>
                        </div>
                    </li>
    
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Account Info
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="#">Login Account</a>
                            <a class="dropdown-item" href="createaccount.jsp">Signup/Create account</a>
                            <a class="dropdown-item" href="#">Logout</a>
                        </div>
                    </li>
                    
                    
                </ul>
            </div>
        </nav>
    </header>
    <!---main page-->
    <main>

    </main>
    <!-----footer-->
    <footer>
        <h3 id="foot">
            © 2021 Virtusa Bank . All rights reserved
        </h3>
    </footer>

</body>
</html>