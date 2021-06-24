(ns day1
  (:require [clojure.java.io :as io]
            [clojure.string :as s]))

(def data1
  (sort (map #(Integer/parseInt %)
             (s/split-lines
              (slurp (io/reader "resources/day1input.txt"))))))

(def data2
  (reverse data1))

(defn readfile [filename]
  (with-open [rdr (io/reader filename)]
    (->> rdr
         line-seq
         (map #(Integer/parseInt %))
         set)))


(let [num (readfile "resources/day1input.txt")]
  (for [x num
        :let [y (- 2020 x)]
        :when (contains? num y)
        :when (< x y)]
    [x y]))


(* 811 1209)
