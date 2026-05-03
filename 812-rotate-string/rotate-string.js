const rotateString = (s, goal) =>
    s.length === goal.length && (s + s).includes(goal);