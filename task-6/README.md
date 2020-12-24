# <span style="color: #f7de1b;">ARMSTRONG NUMBER</span>
* ##  It is  Armstrong numbers are the sum of their own digits to the power of the number of digits.
  ## eg : -  
  * ## <span style="color: #45a32e;">eg :- 153 = 1<sup>3</sup> + 5<sup>3</sup> + 3<sup>3</sup><span style="color: red;">
   * ## <span style="color: #45a32e;">eg :- 1634 = 1<sup>4</sup> + 6<sup>4</sup> + 3<sup>4</sup> + 4<sup>4</sup></span>
* ## pseudo code
        Function Main
            Declare Integer num
    
            display "enter the number you want to check for armstrong number"
            enter value of num
            If check(num)
                then display num & " is an armstrong number"
            else
                display num & "is not an armstrong number"
            End
        End

        Function check (Integer num)
            Declare Boolean check
            Declare Integer count
            Declare Integer sum
            Declare Integer temp
            Declare Integer a

            set sum = 0
            set count = count(num)
            set a = num
            While a is greater than 0
                calculate temp = a%10
                calcuate sum = sum+ temp ^ count
                set a = a/10
            End
            If sum is equal to num
                 then set check = true
            else
                 set check = false
             End
        Return Boolean check

        Function count (Integer num)
            Declare Integer count
    
            set count = 0
            While num greater than 0
                increase value of count by 1
                set value of num = num/10
            End
        Return Integer count
    * ## FLOW CHART
    
    ![flow chart](res/task-6.jpg)
    * ## ALGORITHM
     1. FIRST INITIALIZE NUM
     1. GET VALUE OF NUM
     1. CALL CHECK(NUM) IN IF
        1. IN CHECK(NUM) INITIALIZE INTERGER COUNT, SUM, TEMP AND A WHERE SUM = 0 AND BOOLEAN CHECK
        1. SET COUNT = COUNT(NUM)
            1. WHEN COUNT(NUM) IS CALLED, INITAILIZE COUNT = 0
            1. IF NUM IS GREATER THAN 0 INCREASE COUNT BY 1 AND SET NUM = NUM/10 AND CHECK AGAIN, ELSE MOVE TO THE NEXT STEP
            1. RETURN CHECK
        1. SET A = NUM
        1. IF A IS GREATER THAN 0
            1. SET TEM = NUM%10
            1. INCREASE VALUE OF SUM BY TEMP<SUP>COUNT</SUP>
            1. SET A = A/10
            1. CHECK AGAIN
        1. IF ABOVE STEP IS FALSE THEN CHECK IF SUM == NUM
            1. IF TRUE SET CHECK = TRUE
            1. IF FALSE SET CHECK = FALSE
        1. RETURN CHECK
    1. IF CHECK(NUM) IS TRUE THEN NUM IS  AN ARMSTRONG NUMBER
          ELSE NUM IS NOT AN ARMSTRONG NUMBER
          
      
      
