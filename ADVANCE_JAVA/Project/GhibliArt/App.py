import os
import torch
from diffusers import StableDiffusionPipeline
from PIL import Image

# Yeh function Ghibli art banayega human image ke liye
def generate_ghibli_art_from_image(image_path, output_folder="ghibli_output"):
    # Model load karo
    model_id = "stabilityai/stable-diffusion-2"
    pipe = StableDiffusionPipeline.from_pretrained(model_id)
    pipe.to("cuda" if torch.cuda.is_available() else "cpu")

    # Image kholo aur naam nikalo
    img = Image.open(image_path)
    img_name = os.path.basename(image_path).split('.')[0]  # Image ka naam without extension

    # User se human ke liye prompt maango
    print(f"\nProcessing human image: {img_name}")
    user_prompt = input(f"Enter a prompt for Ghibli-style art of the human in '{img_name}' (e.g., 'a young warrior in a mystical village'): ")

    # Ghibli-style human art banao user ke prompt ke saath
    final_prompt = f"a Ghibli-style anime character, {user_prompt}, detailed face, expressive eyes, fantasy setting"
    ghibli_image = pipe(final_prompt).images[0]

    # Output folder banao agar nahi hai
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)

    # Naya image save karo
    output_path = os.path.join(output_folder, f"ghibli_{img_name}.png")
    ghibli_image.save(output_path)
    print(f"Ghibli human art saved at {output_path}")

# Yeh main part hai jo multiple images ke liye kaam karega
def process_all_images(input_folder):
    # Input folder se sab images dhundo
    for filename in os.listdir(input_folder):
        if filename.endswith((".jpg", ".png", ".jpeg")):  # Sirf image files
            image_path = os.path.join(input_folder, filename)
            print(f"\nFound image: {filename}")
            generate_ghibli_art_from_image(image_path)

# Apna input folder daal do (jahaan human images rakhi hain)
input_folder = "C:/Users/KIIT/Desktop/adi/Full_Stack_Developer/Project/GhibliArt"  # Folder path
process_all_images(input_folder)