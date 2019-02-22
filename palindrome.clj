(def is-empty? (comp not empty?))
(def remaining (comp vec rest butlast))

(def are-first-and-last-elements-same
  (comp
   (partial apply =)
   (partial (juxt first last))))

(def expand-vector
  (comp
   (partial take-while is-empty)
   (partial iterate remaining)))

(def palidrome?
  (comp
   (partial every? are-first-and-last-elements-same)
   (partial expand-vector)))

(palidrome? [1 2 1])
