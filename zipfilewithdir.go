package main

import (
	"archive/zip"
	"os"
)

func main() {
	f, err := os.OpenFile(os.Args[1], os.O_CREATE|os.O_TRUNC|os.O_WRONLY, 0644)
	if err != nil {
		panic(err)
	}
	z := zip.NewWriter(f)
	_, err = z.Create("dir/")
	if err != nil {
		panic(err)
	}
	if err := z.Close(); err != nil {
		panic(err)
	}
	if err := f.Close(); err != nil {
		panic(err)
	}
}
