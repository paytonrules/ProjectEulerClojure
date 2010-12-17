(ns project_euler.euler_two_spec
  (:use 
    [speclj.core]
    [project_euler.core]))

(describe "Project Euler Number 2"

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
(run-specs)

(print (sum-of-even-fibonaccis-up-to 4000000))
