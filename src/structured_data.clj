(ns structured-data)

(defn do-a-thing [x]
  (let [x (+ x x) ]
    (Math/pow x x )
  )
  )

(defn spiff [v]
  (+ (get v 0) (get v 2))
  )

(defn cutify [v]
  (conj v "<3")
  )

(defn spiff-destructuring [v]
 (let [[x y z] v]
  (+ x z))
  )

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn width [rectangle]
  (let [[[x1 y1] [x2 y2]] rectangle]
    (- x2 x1)
  )
  )

(defn height [rectangle]
  (let [[[x1 y1] [x2 y2]] rectangle]
   (- y2 y1)
  )
  )

(defn square? [rectangle]
  (= (height rectangle) (width rectangle)
                               )
  )

(defn area [rectangle]
  (* (height rectangle)(width rectangle))
)


(defn contains-point? [rectangle point]
  (let [[[x1 y1] [x2 y2]] rectangle]
  (let [[x3 y3] point]
      (if (and (<= x1 x3 x2) (<= y1 y3 y2))
      true
      false
   )
  )
  )
)

(defn contains-rectangle? [outer inner]
  (let [[[x1 y1][x2 y2]] inner]
    (if (and (contains-point? outer [x1 y1] ) (contains-point? outer [x2 y2]))
      true
      false
      )
  )
)



(defn title-length [book]
  (count (get book :title)))

(defn author-count [book]
  (count (get book :authors)))

(defn multiple-authors? [book]
  (if (>  (author-count book) 1)
    true
    false
  )
)

(defn alive? [author]
  (if(contains? author :death-year)
    false
    true
)
  )

(defn show-author [book]
  (:authors book)
  )

;; otetaan talteen authors-litania
;; conj siihen name
;; assoc kirjaan tämä uusi authors-litania

(defn add-author4 [book new-author]
  (let [tekijat [conj show-author book new-author]]
  (assoc book :authors tekijat)
  )
)

(defn add-author3 [book new-author]
  (let [authors [:authors book]]
    (conj authors new-author)
    (assoc book :authors authors)
    )
  )

(defn add-author2 [book new-author]
  (let [authors [book :name]]
      (conj authors :name new-author)
      (assoc book :authors authors)
    )
  )


(defn pituus [x]
  (count x)
  )

(defn element-lengths [collection]
  (map pituus collection))

(defn second-elements [collection]
  (let [munge2 (fn [x] (get x 1))]
    (map munge2 collection)
    )
        )

(defn titles [books]
  (let [kirjat books]
  (map :title kirjat))
  )


(defn monotonic? [a-seq]
  :-)

(defn stars [n]
  :-)

(defn toggle [a-set elem]
  :-)

(defn contains-duplicates? [a-seq]
  :-)

(defn old-book->new-book [book]
  :-)

(defn has-author? [book author]
  :-)

(defn authors [books]
  :-)

(defn all-author-names [books]
  :-)

(defn author->string [author]
  :-)

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%
