<?php

//Misma funcion
function longestSubstringWithoutRepeatingChars($s) {
    //Variables
    $n = strlen($s);
    $maxLength = 0;
    $start = 0;
    $charMap = [];
//For
    for ($i = 0; $i < $n; $i++) {
        //IF
        if (isset($charMap[$s[$i]])) {
            $start = max($start, $charMap[$s[$i]] + 1);
        } //Otra condicion del IF
        $charMap[$s[$i]] = $i;
        $maxLength = max($maxLength, $i - $start + 1);
    }
//Se termina
    return $maxLength;
}

// Ejemplos de uso
$s1 = "abcabebb";
echo longestSubstringWithoutRepeatingChars($s1); // Output: 3

$s2 = "bbbbb";
echo longestSubstringWithoutRepeatingChars($s2); // Output: 1

$s3 = "pwwkew";
echo longestSubstringWithoutRepeatingChars($s3); // Output: 3
?>