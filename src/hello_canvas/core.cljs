(ns hello-canvas.core)
;; create
;;   lein new mies hello-canvas
;; run
;;   lein cljsbuild auto hello-canvas
(. js/console (log "Hello Canvas!"))

(def canvas (let [e (.getElementById js/document "canvas")]
              (atom {:element e :context (.getContext e "2d")})))
(def counter (atom 0))

(defn rgb [r g b]
  (str "rgb(" r "," g "," b ")"))

(defn clear
  "clear the screen"
  [ctx]
  (aset ctx "fillStyle" (rgb 220 220 220))
  (.fillRect ctx 0 0 800 200))

(defn draw
  "draw a fun little animating pattern"
  []
  (let [ctx (:context @canvas)]
    (clear ctx)
    (swap! counter inc)
    (let [c (/ @counter 10.0)]
      (.beginPath ctx)
      (.moveTo ctx 800 0)
      (.lineTo ctx 0 0)
      (doall
       (for [x (range 0 800)]
         (let [y (+ 100 (* 50 (Math/sin (+ c (/ x 20)))))]
           (.lineTo ctx x y))))
      (.closePath ctx)
      (aset ctx "fillStyle" (rgb 100 100 100))
      (.fill ctx))))

;; let there be animation
(js/setInterval draw 50)
