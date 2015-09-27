(defproject pomodoro "0.1.0-SNAPSHOT"
  :description "A simple command line pomodoro client"
  :url "https://github.com/chris-olszewski/pomodoro.clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :main ^:skip-aot pomodoro.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
