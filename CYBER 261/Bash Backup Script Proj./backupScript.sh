#!/bin/bash
# Author: Buterflyse
# Assignment Method: Coding the Solution
# Date: 10/27/2026
# Class CYBER 261
#creating necessary functions:

handleBackup() {

	if [[ -f "$1" ]]; then
		read -p "Please enter the name or path for the directory you want to backup or restore (MUST BE DIRECTORY!): " input1
		outdir="$(realpath "$input1")"
		handleBackup "$outdir"
		exit
	else
		local temp="$1"
		local files=("$temp"/*)

		for var in "${files[@]}"; do
			local dirName=$(basename "$temp")
			local curName=$(basename "$var")
			local timStamp=$(date +"%Y-%m-%d--%H-%M-%S")
			local newName="${timStamp}_${curName}_${dirName}"
			cp -a -- "$var" "$dest"/"$newName"
		done
	fi

}



handleRestore() {
	local dir="$1"
	local bFiles=("$dest"/*)
	local dirBase=$(basename "$dir")
	for var in "${bFiles[@]}"; do

		local fileName="${var#*_}"
		local fName="${fileName%%_*}"
		echo "$fName"

		local temp="${var##*_}"
		if [ $temp == $dirBase ]; then
			echo "Now restoring $var"
			cp -a -- $var "$dir"/"$fName"
			echo "file restored..."


		fi
	done

}


#gathering information and applying it to the correct functions as well as applying the correct funtions.

read -p "Please enter the name or path for directory you want to backup or restore: " input1
outdir="$(realpath "$input1")"

if [[ "$input1" == "exit" || "$input1" == "quit" || "$input1" == "bye" && ! -d $input1 ]]; then
	echo "QUITTING SCRIPT!"
	exit
fi

read -p "Please enter 1 to backup your files, or 2 to restore your files: " input2
option="$input2"

if [ "$input2" == "1" ]; then
	read -p "please enter a path for your destination: " in3
	destPriv="$(realpath "$in3")"
	if [ -d "$destPriv/fileBackup" ]; then
		dest="$destPriv/fileBackup"
	else
		mkdir "$destPriv/fileBackup"
		dest="$destPriv/fileBackup"
	fi
	handleBackup "$outdir"

elif [ "$input2" == "2" ]; then
	read -p "please enter the path of your existing backup folder: " in3
	destPriv="$(realpath "$in3")"
	if [ -d "$destPriv/fileBackup" ]; then
		dest="$destPriv/fileBackup"
	else
		echo "No backup found, QUITTING SCRIPT!"
		exit
	fi
	handleRestore "$outdir"
elif [ "$input2" != "1" && "$input2" != "2" ]; then
	echo "Invalid command! QUITTING SCRIPT!"
	exit
fi


