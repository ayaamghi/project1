package edu.guilford;
/**
 * Holds language distributions
 */
public class Languages {
/*
 *  English_Distribution[0][0] would be the letter (as ASCII), [0][1] would be the value, and [0][2] would be the count. [1][0] would be the next symbol's symbol
 */
static final int[][] ENGLISH_DISTRIBUTION = { //integer array to make life easier vs Object array
    {32, 0, 2},   // Blank tile
    {65, 1, 9},
    {66, 3, 2},
    {67, 3, 2},
    {68, 2, 4},
    {69, 1, 12},
    {70, 4, 2},
    {71, 2, 3},
    {72, 4, 2},
    {73, 1, 9},
    {74, 8, 1},
    {75, 5, 1},
    {76, 1, 4},
    {77, 3, 2},
    {78, 1, 6},
    {79, 1, 8},
    {80, 3, 2},
    {81, 10, 1},
    {82, 1, 6},
    {83, 1, 4},
    {84, 1, 6},
    {85, 1, 4},
    {86, 4, 2},
    {87, 4, 2},
    {88, 8, 1},
    {89, 4, 2},
    {90, 10, 1}
};

static final int[][] AFRIKAANS_DISTRIBUTION = {
        {32, 0, 2},   // Blank tile
        {65, 1, 9},   // A
        {66, 8, 1},   // B
        {68, 2, 6},   // D
        {69, 1, 16},  // E
        {70, 8, 1},   // F
        {71, 4, 4},   // G
        {72, 2, 2},   // H
        {73, 1, 9},   // I
        {74, 10, 1},  // J
        {75, 3, 3},   // K
        {76, 2, 2},   // L
        {77, 4, 4},   // M
        {78, 1, 6},   // N
        {79, 1, 6},   // O
        {80, 5, 2},   // P
        {82, 1, 6},   // R
        {83, 1, 6},   // S
        {84, 1, 6},   // T
        {85, 4, 4},   // U
        {86, 5, 2},   // V
        {87, 3, 3},   // W
        {89, 4, 4}    // Y
    };


    static final int[][] ARABIC_DISTRIBUTION = {
        {32, 0, 2},   // Blank tile
        {1575, 1, 8}, // ا
        {1604, 1, 4}, // ل
        {1580, 1, 2}, // ج
        {1581, 1, 2}, // ح
        {1582, 1, 2}, // خ
        {1605, 1, 2}, // م
        {1606, 1, 2}, // ن
        {1607, 1, 2}, // ه
        {1608, 1, 2}, // و
        {1610, 1, 2}, // ي
        {1583, 2, 3}, // د
        {1587, 2, 3}, // س
        {1578, 2, 3}, // ت
        {1601, 3, 3}, // ف
        {1602, 3, 3}, // ق
        {1584, 3, 3}, // ذ
        {1586, 3, 3}, // ز
        {1591, 4, 2}, // ط
        {1589, 4, 2}, // ص
        {1593, 4, 2}, // ع
        {1603, 4, 2}, // ك
        {1592, 5, 1}, // ظ
        {1569, 6, 1}, // ء
        {1594, 8, 1}, // غ
        {1571, 10, 1} // أ
    };

    static int[][] BULGARIAN_DISTRIBUTION = {
            {32, 0, 2},   // Blank tile
            {1040, 1, 9}, // А
            {1054, 1, 9}, // О
            {1045, 1, 8}, // Е
            {1048, 1, 8}, // И
            {1058, 1, 5}, // Т
            {1053, 1, 4}, // Н
            {1056, 1, 4}, // Р
            {1057, 1, 4}, // С
            {1041, 2, 3}, // Б
            {1050, 2, 3}, // К
            {1051, 2, 3}, // Л
            {1042, 2, 4}, // В
            {1044, 2, 4}, // Д
            {1052, 2, 4}, // М
            {1060, 3, 1}, // Ъ
            {1043, 3, 1}, // Г
            {1046, 4, 1}, // Ж
            {1047, 4, 1}, // З
            {1049, 5, 1}, // Й
            {1061, 5, 1}, // Х
            {1063, 5, 1}, // Ч
            {1071, 5, 1}, // Я
            {1059, 5, 1}, // У
            {1062, 8, 1}, // Ц
            {1064, 8, 1}, // Ш
            {1070, 8, 1}, // Ю
            {1068, 10, 1}, // Ь
            {1065, 10, 1}, // Щ
            {1067, 10, 1}  // Ъ
        };
        static final int[][] CATALAN_DISTRIBUTION = {
            {32, 0, 2},    // Blank tile
            {69, 1, 13},   // E
            {65, 1, 12},   // A
            {73, 1, 8},    // I
            {82, 1, 6},    // R
            {83, 1, 6},    // S
            {78, 1, 6},    // N
            {84, 1, 5},    // T
            {79, 1, 5},    // O
            {76, 1, 4},    // L
            {85, 1, 4},    // U
            {67, 2, 3},    // C
            {68, 2, 3},    // D
            {77, 2, 3},    // M
            {66, 3, 2},    // B
            {71, 3, 2},    // G
            {80, 3, 2},    // P
            {70, 4, 1},    // F
            {86, 4, 1},    // V
            {72, 8, 1},    // H
            {74, 8, 1},    // J
            {81, 8, 1},    // Q
            {90, 8, 1},    // Z
            {199, 10, 1},  // Ç
            {183, 10, 1},  // Middle Dot (·)
            {76, 10, 1},   // L·L
            {78, 10, 1},   // NY
            {88, 10, 1}    // X
        };
        static final int[][] CROATIAN_DISTRIBUTION = {
            {32, 0, 2},    // Blank tile
            {65, 1, 11},   // A
            {73, 1, 10},   // I
            {69, 1, 9},    // E
            {79, 1, 9},    // O
            {78, 1, 6},    // N
            {83, 1, 5},    // S
            {82, 1, 5},    // R
            {84, 1, 5},    // T
            {74, 1, 4},    // J
            {85, 1, 4},    // U
            {75, 2, 3},    // K
            {77, 2, 3},    // M
            {80, 2, 3},    // P
            {86, 2, 3},    // V
            {66, 3, 2},    // B
            {67, 3, 2},    // C
            {71, 3, 2},    // G
            {76, 3, 2},    // L
            {90, 3, 2},    // Z
            {68, 3, 1},    // D
            {268, 4, 1},   // Č
            {72, 4, 1},    // H
            {76, 4, 1},    // LJ
            {78, 4, 1},    // NJ
            {352, 4, 1},   // Š
            {381, 4, 1},   // Ž
            {262, 5, 1},   // Ć
            {70, 8, 1},    // F
            {272, 10, 1},  // DŽ
            {208, 10, 1}   // Đ
        };
    }





