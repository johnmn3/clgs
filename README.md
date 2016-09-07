# clgs

Run Clojurescript on [Google Apps Script](https://developers.google.com/apps-script/).

## Overview

Apparently, the Google Apps Script servers are similar to Node.js. 

Currently, expressions like `(take 4 (range 10))` work correctly. However, `def`'ing functions does not yet work. Any advice would be appreciated. 

## Setup

Clean project specific out:

    lein clean
     
Build a single release artifact with the following script.

    ./scripts/release

In [this](https://script.google.com/d/1vUqjhUd21PD84gXqgOUy9tpx-kpvLRn2kZh-2y9DpwTrf-JTwh2F0xp1/edit?usp=drive_web&folder=0ALH6Pc2iSIKdUk9PVA&splash=yes) Apps Script project, go to the menu item 'File' and then "Make a Copy".

Delete the contents of the cljs.js tab of the new App Script project.

Then copy the contents of ./release/clgs.js to the cljs.js tab.

Go to the menu item "Run" and run your functions.

You can view the logs by clicking the menu item "View" and then "Logs".

As you can see, some things work and some things don't.

Let me know if you figure out how to fix any of the functionality!

## License

Copyright © 2016 John Newman

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
