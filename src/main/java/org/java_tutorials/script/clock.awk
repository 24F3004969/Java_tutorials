#!/usr/bin/awk -f

BEGIN {
    # Constants
    R = 2.0
    c_r = 0.6
    r = 1.5
    PI = 3.14159265359
    
    # Colors (same as your Java version)
    CYAN = "\033[0;96m"
    GREEN = "\033[0;32m"
    YELLOW = "\033[0;33m"
    RED = "\033[0;31m"
    RESET = "\033[0m"
    
    # Initialize hand positions
    sec_x = R; sec_y = R - c_r
    min_x = R; min_y = R - c_r  
    hou_x = R; hou_y = R - c_r
    
    while (1) {
        start_time = systime() * 1000  # Convert to milliseconds
        
        # Get current time (equivalent to LocalTime.now())
        "date +%H" | getline hours; close("date +%H")
        "date +%M" | getline minutes; close("date +%M") 
        "date +%S" | getline seconds; close("date +%S")
        
        # Convert to numbers and handle format
        hours = int(hours)
        minutes = int(minutes) 
        seconds = int(seconds)
        
        # Rotate hands (equivalent to your rotate calls)
        min_coords = rotate(minutes * -6, R, R, R, R - c_r)
        split(min_coords, min_pos, " ")
        min_x = min_pos[1]; min_y = min_pos[2]
        
        hou_coords = rotate(hours * -30, R, R, R, R - 0.4)
        split(hou_coords, hou_pos, " ")
        hou_x = hou_pos[1]; hou_y = hou_pos[2]
        
        # Build display string
        display = ""
        
        # Main rendering loop (same as your nested for loops)
        for (y = 0; y < 2 * R; y += 0.01) {
            for (x = 0; x < 2 * R; x += 0.01) {
                # Boolean conditions (same as your Java code)
                I = isOutsideCircle(x, y, r, R, R)
                K = isInsideCircle(x, y, R, R, R)
                S = isInsideCircle(x, y, c_r, sec_x, sec_y)
                M = isInsideCircle(x, y, c_r, min_x, min_y)
                H = isInsideCircle(x, y, 0.4, hou_x, hou_y)
                
                line_s = lineContains(R, R, sec_x, sec_y, x, y)
                line_m = lineContains(R, R, min_x, min_y, x, y)
                line_h = lineContains(R, R, hou_x, hou_y, x, y)
                
                # Same conditional logic as Java
                if ((K && I) && 0) {  # Your condition was && false
                    display = display CYAN "██" RESET
                }
                else if (line_s && S) {
                    display = display GREEN "██" RESET
                }
                else if (line_m && M) {
                    display = display YELLOW "██" RESET
                }
                else if (line_h && H) {
                    display = display RED "██" RESET
                }
                else if (isInsideCircle(x, y, r, R, R) && isOutsideCircle(x, y, r - 0.1, R, R)) {
                    tick = int(calculateAngleInDegree(R, R, x, y) + 0.5)  # Math.round equivalent
                    if (tick % 30 == 0) {
                        display = display RED "██" RESET
                    }
                    else {
                        display = display "  "
                    }
                }
                else {
                    display = display "  "
                }
            }
            display = display "\n"
        }
        
        # Output (same as your System.out.println)
        print display
        
        # Rotate second hand for next iteration
        sec_coords = rotate(-6, R, R, sec_x, sec_y)
        split(sec_coords, sec_pos, " ")
        sec_x = sec_pos[1]; sec_y = sec_pos[2]
        
        # Clear screen and position cursor (same as your \u001b[H)
        printf "\033[H"
        
        # Sleep calculation (same as your Thread.sleep logic)
        end_time = systime() * 1000
        sleep_ms = 1000 - (end_time - start_time)
        if (sleep_ms > 0) {
            system("sleep " sleep_ms/1000)
        }
    }
}

# Convert your isInsideCircle method
function isInsideCircle(px, py, radius, cx, cy) {
    return calculateCircle(px, py, radius, cx, cy) <= 0
}

# Convert your isOutsideCircle method
function isOutsideCircle(px, py, radius, cx, cy) {
    return calculateCircle(px, py, radius, cx, cy) > 0
}

# Convert your calculateCircle method (exact same formula)
function calculateCircle(px, py, r, cx, cy) {
    return py*py + px*px + cx*cx + cy*cy - 2*cx*px - 2*cy*py - r*r
}

# Convert your rotate method (exact same math)
function rotate(angle, center_x, center_y, point_x, point_y) {
    angle_rad = angle * PI / 180  # Math.toRadians equivalent
    x = point_x
    y = point_y
    X = center_x
    Y = center_y
    arg = atan2(y - Y, x - X)
    d = arg - angle_rad
    dist = sqrt((X - x)*(X - x) + (Y - y)*(Y - y))
    new_x = center_x + (dist * cos(d))
    new_y = center_y + (dist * sin(d))
    return new_x " " new_y
}

# Convert your calculateAngleInDegree method
function calculateAngleInDegree(center_x, center_y, point_x, point_y) {
    x = point_x
    y = point_y
    X = center_x
    Y = center_y
    arg = atan2(y - Y, x - X)
    return arg * 180 / PI  # Math.toDegrees equivalent
}

# Convert your Line.contains method
function lineContains(x1, y1, x2, y2, px, py) {
    # Calculate slope
    if (x2 == x1) {
        # Vertical line (infinite slope)
        return abs(px - x1) <= 0.01
    }
    
    slope = (y2 - y1) / (x2 - x1)
    
    # Check if point is on line with tolerance
    expected_y = y1 + slope * (px - x1)
    return (py - expected_y == 0) || (abs(py - expected_y) <= 0.01)
}

# Utility function for absolute value
function abs(x) {
    return (x < 0) ? -x : x
}

