
Minimal code to run Clojure
---

### Usage

Make sure you Boot is installed and run:

```bash
boot build
java -jar target/project.jar
```

### Code

`src/demo/main.clj`:

```clojure
(ns demo.main
  (:gen-class))

(defn -main []
  (println "trying to print demo of Chen"))
```

```clojure
(set-env! :dependencies '[[org.clojure/clojure "1.8.0"]]
          :source-paths #{"src/"})

(deftask build []
  (comp
    (aot :all true)
    (pom :project 'demo :version "0.1.0")
    (uber)
    (jar :main 'demo.main)
    (target)))
```

### Related Gist

https://gist.github.com/jballanc/745a88240e30929cfc01

### License

MIT
