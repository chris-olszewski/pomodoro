(ns pomodoro.core
  (:gen-class)
  (:import java.util.Date))

(defn -main
  "Main method"
  [& args]
  (defn prompt
   "Prompts user to input task and then begins timer"
   []
   (do
     (print "What task are you working on? ")
     (flush)
     (read-line)))
  (defn timer
   "Waits given time while displaying given message"
    [wait-time task]
   (def end-time (+ (.getTime (Date.)) wait-time))
    (defn time-string [time] 
      (str  "1:" (mod time 60000)))
   (do
     (println (str "Current task: " task))
     (while (< (.getTime (Date.)) end-time )
       (do
         (Thread/sleep 1000)))
     (if (nil? task)
         (-main)
         (timer (* 5 60000) nil)))) 
  (timer (* 25 60000) (prompt)))
