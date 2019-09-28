(ns clj-omnibus)
;=====================~ Repl Commands ~==========================;
(defn help []
	(print "This is a comglumerate of clojure knowledge, structured for easy reference.
Available options are:
1. atoms		: Lists all atoms used by clojure
2. structs		: Lists all data structures used by clojure
3. funcs		: Lists all function types and parameters used by clojure
-. (define [option])	: Elaborates an above option in human-readable format.
-. (help)		: Displays this help message.
-. (rr)			: Reloads the namespace.\n"))

(defn define [data]
	(print data))

(defn rr [] "This function reloads the namespace"
	(use 'clj-omnibus :reload-all))

;========================~ Atoms ~===============================;
(def atoms '(true false nil))

;=====================~ Data Structures ~========================;
(def structs {list (), vector [], hash {}, set #{}})

;======================~ Functions ~=============================;

;=====================~ Java Interop ~===========================;
'(. object-expr-or-classname-symbol method-or-member-symbol optional-args*)
; e.g. (. Math abs -5)
