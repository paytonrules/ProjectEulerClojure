(ns project_euler.core)

(defn sum-of-evens [range]
  (reduce + (filter even? range) ))

(defn fibonacci-sequence []
  ((fn fibonacci [a b]
     (lazy-seq (cons a (fibonacci b (+ a b)))))
    0 1))

(defn fibonacci-sequence-up-to [maximum]
  (take-while (fn [a] (<= a maximum)) (fibonacci-sequence)))

(defn sum-of-even-fibonaccis-up-to [maximum]
  (sum-of-evens (fibonacci-sequence-up-to maximum)))
