(ns project_euler.fibonacci_sequence_spec
  (:use 
    [speclj.core]
    [project_euler.core]))

(describe "Project Euler Number 2 - The Fibonacci Sequence"

  (it "returns the sum of all even numbered terms for a sequence of 2"
    (should= 2 (sum-of-evens (range 1 3) )))

  (it "returns said sum for larger ranges"
    (should= 6 (sum-of-evens (range 1 5) ) ) )

  (it "returns the fibonacci sequence up to 0"
    (should= (lazy-seq [0]) (fibonacci-sequence-up-to 0)))

  (it "returns the fibonacci sequence up to 0 1 1"
    (should= (lazy-seq [0 1 1]) (fibonacci-sequence-up-to 1)))

  (it "returns the fibonacci sequence with 2 as well"
    (should= (lazy-seq [0 1 1 2]) (fibonacci-sequence-up-to 2)))

  (it "sums up the evens up for a fibonacci sequence up to 2"
    (should= 2 (sum-of-even-fibonaccis-up-to 2)))
  
  (it "sums up the evens up for a fibonacci sequence up to 34 (the first 10)"
    (should= 44 (sum-of-even-fibonaccis-up-to 34))))    

(describe "Maximium Prime Factor"
  (it "should return the prime factors for 1"
    (should= (lazy-seq []) (prime-factors 1)))
          
  (it "should return the prime factors for 2"
    (should= (lazy-seq [2]) (prime-factors 2)))

  (it "should return the prime factors for 3"
    (should= (lazy-seq [3]) (prime-factors 3)))

  (it "should return the prime factors for 4"
    (should= (lazy-seq [2 2]) (prime-factors 4)))
  
  (it "should return the prime factors for 5"
    (should= (lazy-seq [5]) (prime-factors 5)))
  
  (it "should return the prime factors for 6"
    (should= (lazy-seq [2 3]) (prime-factors 6)))

  (it "should return the prime factors for 8"
    (should= (lazy-seq [2 2 2]) (prime-factors 8)))
  
  (it "should return the prime factors for 9"
    (should= (lazy-seq [3 3]) (prime-factors 9)))

  (it "should return the largest prime number for 6"
    (should= 3 (largest-prime-number-for 6)))

)
  

(run-specs)

(print "sum of even fibonaccis is ")
(print (sum-of-even-fibonaccis-up-to 4000000))
(print "\n")
(print "largest prime number is ")
(print (largest-prime-number-for 600851475143))

