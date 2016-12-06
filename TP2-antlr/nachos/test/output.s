.rdata
.align 2
$LC0:
       .ascii	"%d\000"
       .align 2
L12:
       .ascii	"Bienvenue dans le Donjon\012\000"
       .align 2
L13:
       .ascii	"Quel étage du donjon ?\012\000"
       .align 2
L16:
       .ascii	"vous avez \000"
       .align 2
L17:
       .ascii	" PV\012\000"
       .align 2
L18:
       .ascii	"vous avez \000"
       .align 2
L19:
       .ascii	" expérience\012\012\000"
       .align 2
L22:
       .ascii	"On attaque l'ennemie \000"
       .align 2
L23:
       .ascii	"\012\000"
       .align 2
L24:
       .ascii	"il lui reste \000"
       .align 2
L25:
       .ascii	" PV\012\000"
       .align 2
L28:
       .ascii	"L'ennemie \000"
       .align 2
L29:
       .ascii	" est mort\012\000"
       .align 2
L32:
       .ascii	"vous etes mort\012\000"
       .align 2
L45:
       .ascii	"étage \000"
       .align 2
L46:
       .ascii	" : ennemie :\000"
       .align 2
L47:
       .ascii	" PV\012\000"
.text
# label main
# beginfunc 
	.align	2
	.globl main
	.ent main
main:
	 addiu	$sp,$sp,-200
	 sw	$31,16($29)
	 sw	$16,24($29)
	 sw	$17,28($29)
	 sw	$18,32($29)
	 sw	$19,36($29)
	 sw	$20,40($29)
	 sw	$21,44($29)
	 sw	$22,48($29)
	 sw	$23,52($29)
# var tab
# var i
# var max
# var choix
# var exp
# var mort
# var vie
# vie = 10
       li   $8, 10
# exp = 1
       li   $9, 1
# i = 10
       li   $10, 10
# max = i
       sw  $10,96($29)
# label L10
       sw  $8,152($29)
       sw  $9,108($29)
       sw  $10,100($29)
L10:
# ifz i goto L11
       lw  $8,96($29)
	beq  $8,0,L11
# var T_2
# T_2 = max - i
       lw  $9,100($29)
	sub $9, $9, $8
# var T_0
# T_0 = i / 4
       li   $10, 4
       sw  $10,160($29)
	div $8, $10
	mflo $10
# var T_1
# T_1 = i + T_0
       lw  $8,96($29)
	add $8, $8, $10
# tab [ T_2 ] = T_1
       sw  $9,156($29)
       li   $11,4
       mult   $9,$11
       mflo   $9
       add   $11,$29,56
       add   $9,$9,$11
       sw  $8,0($9)
# var T_3
# T_3 = i - 1
       lw  $11,96($29)
       li   $9, 1
	sub $9, $11, $9
# i = T_3
       sw  $9,168($29)
# goto L10
       sw  $8,164($29)
       sw  $9,96($29)
       sw  $10,160($29)
	j  L10
# label L11
L11:
# arg L12
       lui   $8,%hi(L12)
       addiu   $8,$8,%lo(L12)
	 sw   $8,0($29)
	move   $4,$8
# call L4
	 jal   n_printf
	 nop
# label L20
L20:
# var T_4
# arg tab
	 add   $8,$29,56
	 sw   $8,0($29)
	move   $4,$8
# arg 10
       li   $8, 10
	 sw   $8,4($29)
	move   $5,$8
# arg vie
       lw  $9,152($29)
	 sw   $9,8($29)
	move   $6,$9
# T_4 =  call isnotfinish
	 jal   isnotfinish
	 nop
# ifz T_4 goto L21
       sw  $2,172($29)
       move  $8,$2
	beq  $8,0,L21
# arg tab
	 add   $9,$29,56
	 sw   $9,0($29)
	move   $4,$9
# arg 10
       li   $9, 10
	 sw   $9,4($29)
	move   $5,$9
# call afficherdonjon
	 jal   afficherdonjon
	 nop
# arg L13
       lui   $8,%hi(L13)
       addiu   $8,$8,%lo(L13)
	 sw   $8,0($29)
	move   $4,$8
# call L4
	 jal   n_printf
	 nop
# choix =  call L8
       addiu   $5,$29,104
       lui   $4,%hi($LC0)
       addiu   $4,$4,%lo($LC0)
	 jal   n_read_int
	 nop
       sw   $2,104($29)
# var T_5
# arg exp
       lw  $8,108($29)
	 sw   $8,0($29)
	move   $4,$8
# arg choix
       move  $9,$2
	 sw   $9,4($29)
	move   $5,$9
# var T_6
# T_6 = tab [ choix ]
       sw  $9,104($29)
       li   $10,4
       mult   $9,$10
       mflo   $9
       add   $10,$29,56
       add   $9,$9,$10
       lw  $9,0($9)
# arg T_6
       sw  $9,180($29)
	 sw   $9,8($29)
	move   $6,$9
# T_5 =  call attaquer
       sw  $2,104($29)
	 jal   attaquer
	 nop
# tab [ choix ] = T_5
       lw  $8,104($29)
       li   $9,4
       mult   $8,$9
       mflo   $8
       add   $9,$29,56
       add   $8,$8,$9
       move  $9,$2
       sw  $9,0($8)
# var T_7
# T_7 = tab [ choix ]
       lw  $8,104($29)
       li   $10,4
       mult   $8,$10
       mflo   $8
       add   $10,$29,56
       add   $8,$8,$10
       lw  $8,0($8)
# ifz T_7 goto L14
       sw  $2,176($29)
       sw  $8,184($29)
       sw  $9,176($29)
	beq  $8,0,L14
# var T_8
# T_8 = vie - 1
       lw  $11,152($29)
       li   $10, 1
	sub $10, $11, $10
# vie = T_8
       sw  $10,188($29)
# goto L15
       sw  $10,152($29)
	j  L15
# label L14
L14:
# label L15
L15:
# var T_9
# arg tab
	 add   $8,$29,56
	 sw   $8,0($29)
	move   $4,$8
# arg 10
       li   $8, 10
	 sw   $8,4($29)
	move   $5,$8
# T_9 =  call getexp
	 jal   getexp
	 nop
# var T_10
# T_10 = T_9 + 1
       move  $9,$2
       li   $8, 1
	add $8, $9, $8
# exp = T_10
       sw  $8,196($29)
# arg L16
       lui   $10,%hi(L16)
       addiu   $10,$10,%lo(L16)
	 sw   $10,0($29)
	move   $4,$10
# call L4
       sw  $2,192($29)
       sw  $8,108($29)
       sw  $9,192($29)
	 jal   n_printf
	 nop
# arg vie
       lw  $8,152($29)
	 sw   $8,0($29)
	move   $4,$8
# call L2
       move $5,$4
       lui   $4,%hi($LC0)
       addiu   $4,$4,%lo($LC0)
	 jal   n_printf
	 nop
# arg L17
       lui   $8,%hi(L17)
       addiu   $8,$8,%lo(L17)
	 sw   $8,0($29)
	move   $4,$8
# call L4
	 jal   n_printf
	 nop
# arg L18
       lui   $8,%hi(L18)
       addiu   $8,$8,%lo(L18)
	 sw   $8,0($29)
	move   $4,$8
# call L4
	 jal   n_printf
	 nop
# arg exp
       lw  $8,108($29)
	 sw   $8,0($29)
	move   $4,$8
# call L2
       move $5,$4
       lui   $4,%hi($LC0)
       addiu   $4,$4,%lo($LC0)
	 jal   n_printf
	 nop
# arg L19
       lui   $8,%hi(L19)
       addiu   $8,$8,%lo(L19)
	 sw   $8,0($29)
	move   $4,$8
# call L4
	 jal   n_printf
	 nop
# goto L20
	j  L20
# label L21
L21:
# endfunc 
	 lw	$16,20($29)
	 lw	$17,24($29)
	 lw	$18,28($29)
	 lw	$19,32($29)
	 lw	$20,36($29)
	 lw	$21,40($29)
	 lw	$22,44($29)
	 lw	$23,48($29)
	 lw	$31,16($29)
	 addiu	$sp,$sp,200
	 jr  $31
	 nop
	.end main
# label attaquer
# beginfunc 
	.align	2
	.globl attaquer
	.ent attaquer
attaquer:
	 addiu	$sp,$sp,-44
	 sw	$31,16($29)
# var attaque
# var choix
# var pv
# var temp
# var n
# arg L22
       lui   $8,%hi(L22)
       addiu   $8,$8,%lo(L22)
	 sw   $8,0($29)
	move   $4,$8
# call L4
	 jal   n_printf
	 nop
# arg choix
       lw  $8,48($29)
	 sw   $8,0($29)
	move   $4,$8
# call L2
       move $5,$4
       lui   $4,%hi($LC0)
       addiu   $4,$4,%lo($LC0)
	 jal   n_printf
	 nop
# arg L23
       lui   $8,%hi(L23)
       addiu   $8,$8,%lo(L23)
	 sw   $8,0($29)
	move   $4,$8
# call L4
	 jal   n_printf
	 nop
# var T_11
# arg pv
       lw  $8,52($29)
	 sw   $8,0($29)
	move   $4,$8
# arg attaque
       lw  $9,44($29)
	 sw   $9,4($29)
	move   $5,$9
# T_11 =  call plusgrand
	 jal   plusgrand
	 nop
# ifz T_11 goto L26
       sw  $2,32($29)
       move  $8,$2
	beq  $8,0,L26
# arg L24
       lui   $9,%hi(L24)
       addiu   $9,$9,%lo(L24)
	 sw   $9,0($29)
	move   $4,$9
# call L4
	 jal   n_printf
	 nop
# var T_12
# T_12 = pv - attaque
       lw  $9,52($29)
       lw  $8,44($29)
	sub $8, $9, $8
# arg T_12
       sw  $8,36($29)
	 sw   $8,0($29)
	move   $4,$8
# call L2
       move $5,$4
       lui   $4,%hi($LC0)
       addiu   $4,$4,%lo($LC0)
	 jal   n_printf
	 nop
# arg L25
       lui   $8,%hi(L25)
       addiu   $8,$8,%lo(L25)
	 sw   $8,0($29)
	move   $4,$8
# call L4
	 jal   n_printf
	 nop
# var T_13
# T_13 = pv - attaque
       lw  $9,52($29)
       lw  $8,44($29)
	sub $8, $9, $8
# return T_13
       move  $2,$8
	 lw	$31,16($29)
	 addiu	$sp,$sp,44
	 jr  $31
	 nop
# goto L27
       sw  $2,40($29)
	j  L27
# label L26
L26:
# arg L28
       lui   $8,%hi(L28)
       addiu   $8,$8,%lo(L28)
	 sw   $8,0($29)
	move   $4,$8
# call L4
	 jal   n_printf
	 nop
# arg choix
       lw  $8,48($29)
	 sw   $8,0($29)
	move   $4,$8
# call L2
       move $5,$4
       lui   $4,%hi($LC0)
       addiu   $4,$4,%lo($LC0)
	 jal   n_printf
	 nop
# arg L29
       lui   $8,%hi(L29)
       addiu   $8,$8,%lo(L29)
	 sw   $8,0($29)
	move   $4,$8
# call L4
	 jal   n_printf
	 nop
# return 0
       li   $2, 0
	 lw	$31,16($29)
	 addiu	$sp,$sp,44
	 jr  $31
	 nop
# label L27
L27:
# endfunc 
	 lw	$31,16($29)
	 addiu	$sp,$sp,44
	 jr  $31
	 nop
	.end attaquer
# label isnotfinish
# beginfunc 
	.align	2
	.globl isnotfinish
	.ent isnotfinish
isnotfinish:
	 addiu	$sp,$sp,-40
	 sw	$31,16($29)
# var tab
# var size
# var vie
# var i
# ifz vie goto L30
       lw  $8,48($29)
	beq  $8,0,L30
# vie = vie
# goto L31
       sw  $8,48($29)
	j  L31
# label L30
L30:
# arg L32
       lui   $8,%hi(L32)
       addiu   $8,$8,%lo(L32)
	 sw   $8,0($29)
	move   $4,$8
# call L4
	 jal   n_printf
	 nop
# return 0
       li   $2, 0
	 lw	$31,16($29)
	 addiu	$sp,$sp,40
	 jr  $31
	 nop
# label L31
L31:
# i = size
       lw  $8,44($29)
# label L35
       sw  $8,24($29)
L35:
# ifz i goto L36
       lw  $8,24($29)
	beq  $8,0,L36
# var T_15
# var T_14
# T_14 = size - i
       lw  $9,44($29)
	sub $9, $9, $8
# T_15 = tab [ T_14 ]
       sw  $9,32($29)
       li   $10,4
       mult   $9,$10
       mflo   $9
       lw  $10,40($29)
       add   $9,$9,$10
       lw  $9,0($9)
# ifz T_15 goto L33
       sw  $9,28($29)
	beq  $9,0,L33
# return 1
       li   $2, 1
	 lw	$31,16($29)
	 addiu	$sp,$sp,40
	 jr  $31
	 nop
# goto L34
	j  L34
# label L33
L33:
# label L34
L34:
# var T_16
# T_16 = i - 1
       lw  $9,24($29)
       li   $8, 1
	sub $8, $9, $8
# i = T_16
       sw  $8,36($29)
# goto L35
       sw  $8,24($29)
	j  L35
# label L36
L36:
# return 0
       li   $2, 0
	 lw	$31,16($29)
	 addiu	$sp,$sp,40
	 jr  $31
	 nop
# endfunc 
	 lw	$31,16($29)
	 addiu	$sp,$sp,40
	 jr  $31
	 nop
	.end isnotfinish
# label getexp
# beginfunc 
	.align	2
	.globl getexp
	.ent getexp
getexp:
	 addiu	$sp,$sp,-48
	 sw	$31,16($29)
# var tab
# var size
# var i
# var return
# i = size
       lw  $8,52($29)
# return = 0
       li   $9, 0
# label L39
       sw  $8,24($29)
       sw  $9,28($29)
L39:
# ifz i goto L40
       lw  $8,24($29)
	beq  $8,0,L40
# var T_18
# var T_17
# T_17 = size - i
       lw  $9,52($29)
	sub $9, $9, $8
# T_18 = tab [ T_17 ]
       sw  $9,36($29)
       li   $10,4
       mult   $9,$10
       mflo   $9
       lw  $10,48($29)
       add   $9,$9,$10
       lw  $9,0($9)
# ifz T_18 goto L37
       sw  $9,32($29)
	beq  $9,0,L37
# return = return
       lw  $11,28($29)
# goto L38
       sw  $11,28($29)
	j  L38
# label L37
L37:
# var T_19
# T_19 = return + 1
       lw  $9,28($29)
       li   $8, 1
	add $8, $9, $8
# return = T_19
       sw  $8,40($29)
# label L38
       sw  $8,28($29)
L38:
# var T_20
# T_20 = i - 1
       lw  $9,24($29)
       li   $8, 1
	sub $8, $9, $8
# i = T_20
       sw  $8,44($29)
# goto L39
       sw  $8,24($29)
	j  L39
# label L40
L40:
# return return
       lw  $2,28($29)
	 lw	$31,16($29)
	 addiu	$sp,$sp,48
	 jr  $31
	 nop
# endfunc 
	 lw	$31,16($29)
	 addiu	$sp,$sp,48
	 jr  $31
	 nop
	.end getexp
# label plusgrand
# beginfunc 
	.align	2
	.globl plusgrand
	.ent plusgrand
plusgrand:
	 addiu	$sp,$sp,-52
	 sw	$31,16($29)
# var n
# var m
# var continue
# var nn
# var mm
# var T_21
# T_21 = n * m
       lw  $9,52($29)
       lw  $8,56($29)
	mult $9, $8
	mflo $8
# continue = T_21
       sw  $8,36($29)
# nn = n
# mm = m
       lw  $10,56($29)
# label L41
       sw  $8,24($29)
       sw  $9,28($29)
       sw  $10,32($29)
L41:
# ifz continue goto L42
       lw  $8,24($29)
	beq  $8,0,L42
# var T_22
# T_22 = mm - 1
       lw  $10,32($29)
       li   $9, 1
	sub $9, $10, $9
# mm = T_22
       sw  $9,40($29)
# var T_23
# T_23 = nn - 1
       lw  $11,28($29)
       li   $10, 1
	sub $10, $11, $10
# nn = T_23
       sw  $10,44($29)
# var T_24
# T_24 = nn * mm
	mult $10, $9
	mflo $11
# continue = T_24
       sw  $11,48($29)
# goto L41
       sw  $9,32($29)
       sw  $10,28($29)
       sw  $11,24($29)
	j  L41
# label L42
L42:
# ifz nn goto L43
       lw  $8,28($29)
	beq  $8,0,L43
# return 1
       li   $2, 1
	 lw	$31,16($29)
	 addiu	$sp,$sp,52
	 jr  $31
	 nop
# goto L44
	j  L44
# label L43
L43:
# return 0
       li   $2, 0
	 lw	$31,16($29)
	 addiu	$sp,$sp,52
	 jr  $31
	 nop
# label L44
L44:
# endfunc 
	 lw	$31,16($29)
	 addiu	$sp,$sp,52
	 jr  $31
	 nop
	.end plusgrand
# label afficherdonjon
# beginfunc 
	.align	2
	.globl afficherdonjon
	.ent afficherdonjon
afficherdonjon:
	 addiu	$sp,$sp,-44
	 sw	$31,16($29)
# var tab
# var size
# var i
# i = size
       lw  $8,48($29)
# label L48
       sw  $8,24($29)
L48:
# ifz i goto L49
       lw  $8,24($29)
	beq  $8,0,L49
# arg L45
       lui   $9,%hi(L45)
       addiu   $9,$9,%lo(L45)
	 sw   $9,0($29)
	move   $4,$9
# call L4
	 jal   n_printf
	 nop
# var T_25
# T_25 = size - i
       lw  $9,48($29)
       lw  $8,24($29)
	sub $8, $9, $8
# arg T_25
       sw  $8,28($29)
	 sw   $8,0($29)
	move   $4,$8
# call L2
       move $5,$4
       lui   $4,%hi($LC0)
       addiu   $4,$4,%lo($LC0)
	 jal   n_printf
	 nop
# arg L46
       lui   $8,%hi(L46)
       addiu   $8,$8,%lo(L46)
	 sw   $8,0($29)
	move   $4,$8
# call L4
	 jal   n_printf
	 nop
# var T_27
# var T_26
# T_26 = size - i
       lw  $9,48($29)
       lw  $8,24($29)
	sub $8, $9, $8
# T_27 = tab [ T_26 ]
       sw  $8,36($29)
       li   $10,4
       mult   $8,$10
       mflo   $8
       lw  $10,44($29)
       add   $8,$8,$10
       lw  $8,0($8)
# arg T_27
       sw  $8,32($29)
	 sw   $8,0($29)
	move   $4,$8
# call L2
       move $5,$4
       lui   $4,%hi($LC0)
       addiu   $4,$4,%lo($LC0)
	 jal   n_printf
	 nop
# arg L47
       lui   $8,%hi(L47)
       addiu   $8,$8,%lo(L47)
	 sw   $8,0($29)
	move   $4,$8
# call L4
	 jal   n_printf
	 nop
# var T_28
# T_28 = i - 1
       lw  $9,24($29)
       li   $8, 1
	sub $8, $9, $8
# i = T_28
       sw  $8,40($29)
# goto L48
       sw  $8,24($29)
	j  L48
# label L49
L49:
# endfunc 
	 lw	$31,16($29)
	 addiu	$sp,$sp,44
	 jr  $31
	 nop
	.end afficherdonjon
