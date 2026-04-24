var furthestDistanceFromOrigin = function (moves) {
    // only use regex
    return Math.abs((moves.match(/L/g) || []).length - (moves.match(/R/g) || []).length) + (moves.match(/_/g) || []).length;
};