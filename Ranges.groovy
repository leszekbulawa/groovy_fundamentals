def numbers = 1..10
for (num in numbers) {
    println num
}

def range = 'a'..'g'
for (vat in range) {
    println vat
}

def enum DAYS {
    SUN,
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT
}

def weekdays = DAYS.MON..DAYS.FRI

for (var in weekdays) {
    println var
}
