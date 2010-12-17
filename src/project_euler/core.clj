(ns project_euler.core)

(defn sum-of-evens [range]
  (reduce + (filter even? range) ) )

(defn fibonacci-sequence []
  ((fn fibonacci [a b]
     (lazy-seq (cons a (fibonacci b (+ a b)))))
    0 1))

(defn fibonacci-sequence-up-to [maximum]
  (take-while (fn [a] (<= a maximum)) (fibonacci-sequence)))

(defn sum-of-even-fibonaccis-up-to [maximum]
  (sum-of-evens (fibonacci-sequence-up-to maximum)))

(defn highest-prime [value candidate]
  (cond (= 0 (mod value candidate)) candidate
        :default (highest-prime value (+ 1 candidate))))

(defn prime-factors [value]
  (cond (<= value 1) (lazy-seq [])
        :default (lazy-seq (cons (highest-prime value 2) (prime-factors (/ value (highest-prime value 2)))))))

(defn largest-prime-number-for [value]
  (reduce max (prime-factors value)))
