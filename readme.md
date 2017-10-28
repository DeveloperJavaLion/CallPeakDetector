# Cloning a project
```
git clone https://github.com/DeveloperJavaLion/CallPeakDetector.git
```

# Task

We​ ​want​ to​ write​​ a​ program​ that detects​ ​ the​ ​ peak​ ​ of​ ​ simultaneous​ ​ incoming​ ​ calls​ ​ reaching​ ​ a
large​ ​ call-center.

The​ ​ call-center​ ​ activity​ ​ is​ ​ consolidated​ ​ in​ ​ a ​ ​ text​ ​ file​ ​ (call​ ​ log)​ ​ whose​ ​ lines​ ​ are​ ​ structured​ ​ as
follows:
[start:end]

where​ ​ "start"​ ​ et​ ​ "end"​ ​ are​ ​ integers,​ ​ representing​ ​ the​ ​ timestamps​ ​ of​ ​ the​ ​ call​ ​ start​ ​ and​ ​ the​ ​ call
ending.​ ​ "end"​ ​ is​ ​ always​ ​ superior​ ​ to​ ​ " ​ ​ start​ ​ " ​ ​ and​ ​ the​ ​ lines​ ​ are​ ​ ordered​ ​ by​ ​ start​ ​ startTime.
Here’s​ ​ an​ ​ example​ ​ of​ ​ a ​ ​ simple​ ​ short​ ​ call​ ​ log:
```
1385718405:1385718491
1385718407:1385718409
1385718408:1385718452
1385718408:1385718464
1385718413:1385718452
```
The ​ ​ actual ​ ​ file ​ ​ could ​ ​ contain ​ ​ tens ​ ​ or ​ ​ hundreds ​ ​ of ​ ​ thousands ​ ​ of ​ ​ lines ​ ​ and ​ ​ span ​ ​ across ​ ​ a ​ ​ large
period ​ ​ of ​ ​ startTime, ​ ​ up ​ ​ to ​ ​ several ​ ​ weeks.

The​ ​ program​ ​ reads​ ​ the​ ​ input​ ​ file​ ​ and​ ​ simply​ ​ displays​ ​ the​ ​ maximum​ ​ number​ ​ of​ ​ simultaneous
calls​ ​ (active​ ​ at​ ​ the​ ​ same​ ​ second)​ ​ occurring​ ​ on​ ​ the​ ​ period​ ​ covered​ ​ by​ ​ the​ ​ call​ ​ log,​ ​ and​ ​ the
period(s)​ ​ on​ ​ which​ ​ it​ ​ is​ ​ reached.

Example ​ ​ of ​ ​ an ​ ​ expected ​ ​ result:
```
The​ ​ peak​ ​ for​ ​ this​ ​ call​ ​ log​ ​ is​ ​ 23​ ​ simultaneous​ ​ calls,​ ​ that​ ​ occurred​ ​ between​ ​ 1385718408​ ​ and
1385718412.
```
No​ ​ library​ ​ is​ ​ allowed,​ ​ everything​ ​ must​ ​ be​ ​ coded​ ​ by​ ​ hand.
You​ ​ will​ ​ deliver​ ​ that​ ​ program​ ​ as​ ​ you​ ​ would​ ​ on​ ​ a ​ ​ classic​ ​ development​ ​ project.​ ​ It​ ​ should​ ​ be
immediately​ ​ runnable​ ​ and​ ​ testable.

With​ ​ the​ ​ final​ ​ result​ ​ the​ ​ time​ ​ spent​ ​ for​ ​ the​ ​ task​ ​ should​ ​ be​ ​ named.