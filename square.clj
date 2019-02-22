(def square (comp (partial apply *) (partial repeat 2)))

(square 4)